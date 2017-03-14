package clinic.dermal.api;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
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
import clinic.dermal.logic.SurveyRepository;
import clinic.dermal.model.StorageFileNotFoundException;
import clinic.dermal.model.Survey;

@RestController
public class AnamnesisController {

	private final StorageService storageService;	
	private final SurveyRepository surveyRepo;
	
	@Autowired
	public AnamnesisController(StorageService storageService, SurveyRepository surveyRepo) {
		this.storageService = storageService;
		this.surveyRepo = surveyRepo;
	}

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
	public String handleFormSubmit(@RequestPart("image1") MultipartFile image1,
			@RequestPart("image2") MultipartFile image2, @RequestParam("survey") String surveyJson) {

		final String caseId = UUID.randomUUID().toString();

		System.out.println("######" + surveyJson);
		storageService.store(image1, caseId, "img1_" + image1.getOriginalFilename());
		storageService.store(image2, caseId, "img2_" + image2.getOriginalFilename());

		try {
			Survey s = new ObjectMapper().readValue(surveyJson, Survey.class);
			s.setId(caseId);
			System.out.println("<<<< success >>>> " + s.toString());
			this.surveyRepo.save(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// dummy UUID for now; it will be the UUID of the created issue
		return caseId;
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<Void> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}
}
