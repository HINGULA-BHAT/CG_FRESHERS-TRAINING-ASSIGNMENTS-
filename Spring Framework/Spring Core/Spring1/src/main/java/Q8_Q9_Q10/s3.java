package Q8_Q9_Q10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class s3 implements ApplicationContextAware{
	private String name;
	private long regNo;
	private String branch;
	private ApplicationContext context = null;
	public s3() {
		
	}
	public s3(String name, long regNo, String branch) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRegNo() {
		return regNo;
	}
	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}
	@PostConstruct
	public static void postCont() {
		System.out.println("PostConstruct method is called for Student 3");
	}
	@PreDestroy
	public static void preDest() {
		System.out.println("PreDestroy method is called for Student 3");
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}

}