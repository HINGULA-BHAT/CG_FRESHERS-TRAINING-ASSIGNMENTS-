package mvc.quest10;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController10 {
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

	@RequestMapping(value="/report", method=RequestMethod.GET)
	public ModelAndView employeeXls(HttpServletRequest req, HttpServletResponse res) {
		
		String type= req.getParameter("type");
		
		if(type!=null && type.equals("xls"))
			return new ModelAndView(new ExcelView(), "employeeList", list);
		
		return new ModelAndView("Quest10/EmployeeListReport", "employeeList", list);
	}
}
