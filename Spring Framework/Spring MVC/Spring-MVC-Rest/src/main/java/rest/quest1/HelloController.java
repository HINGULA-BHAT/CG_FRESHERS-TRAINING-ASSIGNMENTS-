package rest.quest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping(value= "/rest/hello")
	public String sayhello() {
		return "Hello World";
	}
}
