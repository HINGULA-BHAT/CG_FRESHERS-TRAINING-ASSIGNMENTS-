package Q8_Q9_Q10;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class s1 implements InitializingBean, DisposableBean{
	private String name;
	private long regNo;
	private String branch;
	public s1() {
		
	}
	public s1(String name, long regNo, String branch) {
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
		return "Student [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}
	  public void afterPropertiesSet() throws Exception { 
		  
		  System.out.println("InitializingBean method is called for Student 1 Bean");
	  
	  }
	public void destroy() throws Exception { 
	  System.out.println("DisposableBean Method is called for Student 1 Bean"); 
	  }
	 

}