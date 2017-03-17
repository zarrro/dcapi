package clinic.dermal.api;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

import clinic.dermal.logic.StorageService;
import clinic.dermal.model.Case;
import clinic.dermal.model.StorageFileNotFoundException;
import clinic.dermal.model.Survey;
import clinic.dermal.persistence.CaseRepository;

@RestController
public class AnamnesisController {

	@Autowired
	private StorageService storageService;
	@Autowired
	private CaseRepository caseRepo;

	@GetMapping("/anamnesis")
	public List<String> listUploadedFiles() throws IOException {

		return storageService.loadAll()
				.map(path -> MvcUriComponentsBuilder
						.fromMethodName(AnamnesisController.class, "serveFile", path.getFileName().toString()).build()
						.toString())
				.collect(Collectors.toList());
	}

	@GetMapping("/files/{filename:.+}")
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}

	@PostMapping("/anamnesis")
	@CrossOrigin(origins = "http://localhost:5555", maxAge = 3600, allowCredentials = "true")
	public String handleFormSubmit(@RequestPart("paymentId") String paymentId,
			@RequestPart("image1") MultipartFile image1, @RequestPart("image2") MultipartFile image2,
			@RequestParam("survey") String surveyJson) {

		if (paymentId == null || paymentId.isEmpty()) {
			throw new IllegalArgumentException("paymentId is empty");
		}
		Case c = this.caseRepo.findByPaymentId(paymentId);
		if (c == null) {
			throw new IllegalArgumentException("paymentId " + paymentId + " doesn't exists");
		}
		if (!c.getState().equals(Case.State.PAYMENT_AUTHORIZED)) {
			throw new IllegalStateException("Case state " + c.getState());
		}
		if (image1 == null){
			throw new IllegalArgumentException("image1 is null");
		}
		if (image2 == null){
			throw new IllegalArgumentException("image2 is null");
		}
		if (surveyJson == null){
			throw new IllegalArgumentException("surveyJson is null");
		}
		
		storageService.store(image1, c.getId(), "img1_" + image1.getOriginalFilename());
		storageService.store(image2, c.getId(), "img2_" + image2.getOriginalFilename());
		Survey s = null;

		try {
			s = new ObjectMapper().readValue(surveyJson, Survey.class);
			System.out.println("######" + surveyJson);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		c.setSurvey(s);
		c.setState(Case.State.READY_FOR_REVIEW);
		this.caseRepo.save(c);

		return c.getPaymentId();
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<Void> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}
}
