package mvc.quest9;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.quest10.Employee;

@Controller
public class EmployeeController9 {
	List<Employee> list= Arrays.asList(
			new Employee(1,"Tom",2346574L),
			new Employee(2,"Stevie",857186L),
			new Employee(3,"Thanos",52524524L),
			new Employee(4,"Namrata",4556363L),
			new Employee(5,"Bhuvi",5344668L),
			new Employee(6,"Barton",8786456L),
			new Employee(7,"Hingula",28674687L),
			new Employee(8,"Bucky",8458864L),
			new Employee(9,"Wandalf",97721654L),
			new Employee(10,"Peterson",2767875L),
			new Employee(11,"Vision",54758786L),
			new Employee(12,"Strange",5445453L),
			new Employee(13,"Quill",5875757L)
			);
	
	@RequestMapping(value="/view-employees")
	public ModelAndView home() {
		return new ModelAndView("Quest9/Home");
	}
	
	@RequestMapping(value = "/view/{offset}")
    public ModelAndView view(@PathVariable("offset")Integer offset){
        ModelAndView mv=new ModelAndView("Quest9/Employees");
        if(offset*5>list.size())
        	mv.addObject("list",list.subList((offset-1)*5,list.size()));
        else
        	mv.addObject("list",list.subList((offset-1)*5,offset*5));
        mv.addObject("length",((list.size())/5)+1);
        return mv;

    }
}
