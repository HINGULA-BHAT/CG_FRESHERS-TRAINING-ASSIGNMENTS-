package capg.spring.rest.quest7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderRepository ordRepo;
	
	@RequestMapping(value="/rest/orders", method=RequestMethod.POST)
	public void add(@RequestBody Order o) {
		ordRepo.save(o);
	}
	
	@RequestMapping(value="/rest/orders/{id}", method=RequestMethod.GET)
	public Order get(@PathVariable("id") int id) {
		return ordRepo.findById(id).get();
	}
	
	@RequestMapping(value="/rest/orders/{id}")
	public void delete(@PathVariable("id") int id) {
		ordRepo.deleteById(id);
	}
	
	@RequestMapping(value="/rest/orders")
	public List<Order> getAll(){
		List<Order> list= new ArrayList<>();
		ordRepo.findAll().forEach(list::add);
		return list;
	}
	
	@RequestMapping(value="rest/orders/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Order o) {
		ordRepo.save(o);
	}
}
