package clinic.dermal.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;

import clinic.dermal.model.PaymentException;

@ControllerAdvice
public class ExceptionHanlderAdvice {
	
	private static final Logger LOG = LoggerFactory.getLogger(ExceptionHanlderAdvice.class);

	@ExceptionHandler(RestClientException.class)
	public ResponseEntity<String> handleException(RestClientException e) {
		logException(e);

		StringBuilder sb = new StringBuilder();
		sb.append("Message: " + e.getMessage() + "\n");

		if (e instanceof RestClientResponseException) {
			RestClientResponseException re = (RestClientResponseException) e;
			sb.append("RawStatusCode: " + re.getRawStatusCode() + "\n");
			sb.append("StatusText: " + re.getStatusText() + "\n");
			sb.append("Headers: " + re.getResponseHeaders().toString() + "\n");
			sb.append("ResponseBody: " + re.getResponseBodyAsString() + "n");
		}
		System.err.println(sb.toString());

		return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body("Failed external system call");
	}

	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<String> handleException(PaymentException e) {
		logException(e);
		return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body(e.getMessage());
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException e) {
		logException(e);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request");
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
		logException(e);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
	}

	private static void logException(Exception e) {
		LOG.error("", e);
	}

}