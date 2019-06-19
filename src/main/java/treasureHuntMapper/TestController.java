package treasureHuntMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hi") 
    public String sayHello() {
    	return "Hello! Uncle Leo!";
    }
}
