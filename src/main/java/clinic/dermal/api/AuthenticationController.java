package clinic.dermal.api;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@RequestMapping("/user")
	@CrossOrigin(origins = "http://localhost:5555", maxAge = 3600, allowCredentials="true")
	public Principal user(Principal user) {
		return user;
	}
}
