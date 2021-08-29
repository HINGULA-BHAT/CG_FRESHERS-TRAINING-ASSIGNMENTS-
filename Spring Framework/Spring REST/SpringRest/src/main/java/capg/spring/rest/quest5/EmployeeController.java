package capg.spring.rest.quest5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empServ;
	
	@RequestMapping(value="/rest/employee", method=RequestMethod.POST)
	public void add(@RequestBody Employee emp) {
		System.out.println(emp);
		empServ.add(emp);
	}
	
	@RequestMapping(value="/rest/employee/{id}", method=RequestMethod.GET)
	public Employee get(@PathVariable("id") int id) {
		return empServ.get(id);
	}
	
	@RequestMapping(value="/rest/employee/{id}")
	public void delete(@PathVariable("id") int id) {
		empServ.delete(id);
	}
	
	@RequestMapping(value="/rest/employee")
	public List<Employee> getAll(){
		return empServ.getAll();
	}
	
	@RequestMapping(value="rest/employee/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Employee emp) {
		empServ.update(emp);
	}
}
