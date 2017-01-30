package hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloController {
	
	@RequestMapping(value = "/hello}",method = RequestMethod.GET)
	public String index() {
		return "Greetings from Spring Boot";
	}

}
