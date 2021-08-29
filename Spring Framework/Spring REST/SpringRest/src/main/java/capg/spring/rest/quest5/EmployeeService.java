package capg.spring.rest.quest5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public void add(Employee emp) {
		empRepo.save(emp);
	}
	
	public Employee get(int id) {
		return empRepo.findById(id).get();
	}
	
	public void delete(int id) {
		empRepo.deleteById(id);
	}
	
	public List<Employee> getAll() {
		List<Employee> list= new ArrayList<>();
		empRepo.findAll().forEach(list::add);
		return list;
	}
	
	public void update(Employee emp) {
		empRepo.save(emp);
	}
	
	
}
