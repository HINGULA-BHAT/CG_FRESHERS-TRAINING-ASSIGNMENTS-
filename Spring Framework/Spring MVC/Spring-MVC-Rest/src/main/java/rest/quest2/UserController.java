package rest.quest2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/rest/user")
	public ModelAndView userform() {
		return new ModelAndView("Rest1/UserForm");
	}
	@ResponseBody
	@RequestMapping("/rest/validateUser")
	public String validate(@RequestParam Map<String, String> req) {
		if(req.get("username").compareTo("samee")==0 && req.get("pass").compareTo("asdfg")==0)
			return "Valid User";
		return "Invalid User";
	}
}
