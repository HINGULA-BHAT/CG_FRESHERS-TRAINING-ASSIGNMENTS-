package mvc.quest3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mav= new ModelAndView("Quest3/Login");
		return mav;
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute("user") User user) {
		
		ModelAndView mav;
		System.out.println(user);
		if(user.getUsername().compareTo("hingula")==0 && user.getPassword().compareTo("bhat")==0)
			mav= new ModelAndView("Quest3/Success");
		else
			mav= new ModelAndView("Quest3/Error");
		
		return mav;
	}
}
