package Question6;

public class student {
	
	private String name;
	private long regNo;
	
	public student(String name, long regNo) {
		super();
		this.name = name;
		this.regNo = regNo;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", regNo=" + regNo + "]";
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
