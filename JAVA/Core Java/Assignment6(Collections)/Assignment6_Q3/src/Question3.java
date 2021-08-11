import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int ID;
	String Name;
	String Department;
	int Salary;
	public Employee(int iD, String name, String department, int salary) {
		super();
		ID = iD;
		Name = name;
		Department = department;
		Salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getID() - o.getID();
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}
	
	
	
}
public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String ch;
		System.out.println("Run Application: \n a)ID \n b)Name \n c)Department \n d)Salary");
		System.out.println("Select one option to Run Application : ");
		ch=scan.next();
		
		
		Set<Employee> set=new TreeSet<>();
		set.add(new Employee(1,"Hingula","JFSA",20000));
		set.add(new Employee(3,"Gohit","CS",22000));
		set.add(new Employee(2,"Lokesh","CBO",21000));
		set.add(new Employee(5,"Rajesh","JFS",23000));
		set.add(new Employee(4,"ManM","IT",25000));
		set.add(new Employee(6,"Pooja","ML",24000));
		set.add(new Employee(7,"Riya","AI",27000));
		set.add(new Employee(9,"Payal","CBO",26000));
		set.add(new Employee(8,"Nikita","CS",29000));
		set.add(new Employee(10,"Richa","IOT",28000));
		
		if(ch.equals("a")) {
			//System.out.println(set);
			Iterator<Employee> it=set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		else if(ch.equals("b")) {
			
			set = new TreeSet<>(Comparator.comparing(Employee::getName));
			set.add(new Employee(1,"Hingula","JFSA",20000));
			set.add(new Employee(3,"Gohit","CS",22000));
			set.add(new Employee(2,"Lokesh","CBO",21000));
			set.add(new Employee(5,"Rajesh","JFS",23000));
			set.add(new Employee(4,"ManM","IT",25000));
			set.add(new Employee(6,"Pooja","ML",24000));
			set.add(new Employee(7,"Riya","AI",27000));
			set.add(new Employee(9,"Payal","CBO",26000));
			set.add(new Employee(8,"Nikita","CS",29000));
			set.add(new Employee(10,"Richa","IOT",28000));
			

			
			//System.out.println(set);
			Iterator<Employee> it=set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		else if(ch.equals("c")) {
				
				set = new TreeSet<>(Comparator.comparing(Employee::getDepartment));
				set.add(new Employee(1,"Hingula","JFSA",20000));
				set.add(new Employee(3,"Gohit","CS",22000));
				set.add(new Employee(2,"Lokesh","CBO",21000));
				set.add(new Employee(5,"Rajesh","JFS",23000));
				set.add(new Employee(4,"ManM","IT",25000));
				set.add(new Employee(6,"Pooja","ML",24000));
				set.add(new Employee(7,"Riya","AI",27000));
				set.add(new Employee(9,"Payal","CBO",26000));
				set.add(new Employee(8,"Nikita","CS",29000));
				set.add(new Employee(10,"Richa","IOT",28000));
				

				//System.out.println(set);
				Iterator<Employee> it=set.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
			}
			else if(ch.equals("d")) {
				
				set = new TreeSet<>(Comparator.comparing(Employee::getSalary));
				set.add(new Employee(1,"Hingula","JFSA",20000));
				set.add(new Employee(3,"Gohit","CS",22000));
				set.add(new Employee(2,"Lokesh","CBO",21000));
				set.add(new Employee(5,"Rajesh","JFS",23000));
				set.add(new Employee(4,"ManM","IT",25000));
				set.add(new Employee(6,"Pooja","ML",24000));
				set.add(new Employee(7,"Riya","AI",27000));
				set.add(new Employee(9,"Payal","CBO",26000));
				set.add(new Employee(8,"Nikita","CS",29000));
				set.add(new Employee(10,"Richa","IOT",28000));
				

				
				//System.out.println(set);
				Iterator<Employee> it=set.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				}
		
	}

}