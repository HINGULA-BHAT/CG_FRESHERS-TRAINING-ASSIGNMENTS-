import java.util.Scanner;

public class TotalAndAverage {
	
	public static void main(String[] args) {
	int p,m,b,p1,m1,b1,p2,m2,b2,p3,m3,b3,x1,y1,x2,y2,x3,y3,z1,z2,z3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student1's SubjectA marks: ");
	p1 = sc.nextInt();
	System.out.println("Enter the Student1's SubjectB marks: ");
	m1 = sc.nextInt();
	System.out.println("Enter the Student1's SubjectC marks: ");
	b1 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectA marks: ");
	p2 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectB marks: ");
	m2 = sc.nextInt();
	System.out.println("Enter the Student2's SubjectC marks: ");
	b2 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectA marks: ");
	p3 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectB marks: ");
	m3 = sc.nextInt();
	System.out.println("Enter the Student3's SubjectC marks: ");
	b3 = sc.nextInt();
	x1= p1+m1+b1;
	y1= x1/3;
	x2 = p2+m2+b2;
	y2 = x2/3;
	x3 = p3+m3+b3;
	y3 = x3/3;
	p = p1+p2+p3;
	m = m1+m2+m3;
	b = b1+b2+b3;
	z1=p/3;
	z2=m/3;
	z3=b/3;
	System.out.println("Student1: Total Marks ="+x1+ " and Average Marks ="+y1);
	System.out.println("Student2: Total Marks ="+x2+ " and Average Marks ="+y2);
	System.out.println("Student3: Total Marks ="+x3+ " and Average Marks ="+y3);
	System.out.println("Total Marks in SubjectA = " +p+ " ,SubjectB = "+m+" ,SubjectC = "+b);
	System.out.println("Average Marks in SubjectA = " +z1+ " ,SubjectB = "+z2+" ,SubjectC = "+z3);		
	}
}