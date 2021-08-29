package Q8_Q9_Q10;

public class s2{
	private String name;
	private long regNo;
	private String branch;
	public s2() {
		
	}
	public s2(String name, long regNo, String branch) {
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
		return "Student2 [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}
	
	public static void myInit() {
		System.out.println("MyInit method is called for Student 2");
	}
	public static void myDestroy() {
		System.out.println("MyDestroy method is called for Student 2");
	}
	

}