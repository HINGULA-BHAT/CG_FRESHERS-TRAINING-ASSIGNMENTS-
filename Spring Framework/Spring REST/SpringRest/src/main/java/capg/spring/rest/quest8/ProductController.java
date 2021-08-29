package capg.spring.rest.quest8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository prodRepo;
	
	@RequestMapping(value="/rest/product", method=RequestMethod.POST)
	public void add(@RequestBody Product p) {
		prodRepo.save(p);
	}
	
	@RequestMapping(value="/rest/product/{id}", method=RequestMethod.GET)
	public Product get(@PathVariable("id") int id) {
		return prodRepo.findById(id).get();
	}
	
	@RequestMapping(value="/rest/product/{id}")
	public void delete(@PathVariable("id") int id) {
		prodRepo.deleteById(id);
	}
	
	@RequestMapping(value="/rest/product")
	public List<Product> getAll(){
		List<Product> list= new ArrayList<>();
		prodRepo.findAll().forEach(list::add);
		return list;
	}
	
	@RequestMapping(value="rest/product/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Product p) {
		prodRepo.save(p);
	}
	
}
