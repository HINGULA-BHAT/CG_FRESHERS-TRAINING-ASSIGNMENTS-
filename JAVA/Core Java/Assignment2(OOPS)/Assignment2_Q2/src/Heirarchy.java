import java.util.Scanner;

class Employee
{
	public void salary() {
		
	}
}
class Manager extends Employee
{
	public void salary() {
		
		double incentives,totalSalary,n,total;;
		
	   Scanner sc=new Scanner(System.in);
	    
	   System.out.println("Enter the salary");
       totalSalary=sc.nextDouble();
                   
       System.out.println("Enter the incentives");
       incentives=sc.nextDouble();
       totalSalary=totalSalary+incentives;
       
       System.out.println("Enter the number of managers");
       n=sc.nextDouble();
       total=n*totalSalary;
        
	   System.out.println("Total Salary for manager is "+totalSalary);
	   System.out.println("Total Salary of all managers "+total);
	   
          }
	}

class Labour extends Employee
{
	public void salary() {
		double overtime,overamt,totalSalary,n,total;
		
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter salary");
        totalSalary=sc.nextDouble();
                   
        System.out.println("enter the overtime hours");
        overtime=sc.nextDouble();
        
        System.out.println("enter the overtime amunt per hour");
        overamt=sc.nextDouble();
        totalSalary=totalSalary+(overtime*overamt);
        
        System.out.println("enter the number of labours");
        n=sc.nextDouble();
        total=n*totalSalary;
                   
	     System.out.println("Total Salary for labour is "+totalSalary);
	     System.out.println("Total Salary of all labours"+total);
	     
}
}
public class Heirarchy {

	public static void main(String[] args) {
		
		Manager b=new Manager();
		b.salary();
		Labour c=new Labour();
		c.salary();

	}

}
