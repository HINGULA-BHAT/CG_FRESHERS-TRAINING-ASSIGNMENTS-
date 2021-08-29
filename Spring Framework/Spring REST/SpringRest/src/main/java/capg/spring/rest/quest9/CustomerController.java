package capg.spring.rest.quest9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import capg.spring.rest.quest7.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository cusRepo;
	
	@RequestMapping(value="/rest/customer", method=RequestMethod.POST)
	public void add(@RequestBody Customer c) {
		cusRepo.save(c);
	}
	
	@RequestMapping(value="/rest/customer/{id}", method=RequestMethod.GET)
	public Customer get(@PathVariable("id") int id) {
		return cusRepo.findById(id).get();
	}
	
	@RequestMapping(value="/rest/customer/{id}")
	public void delete(@PathVariable("id") int id) {
		cusRepo.deleteById(id);
	}
	
	@RequestMapping(value="/rest/customer")
	public List<Customer> getAll(){
		List<Customer> list= new ArrayList<>();
		cusRepo.findAll().forEach(list::add);
		return list;
	}
	
	@RequestMapping(value="rest/customer/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Customer c) {
		cusRepo.save(c);
	}
}
