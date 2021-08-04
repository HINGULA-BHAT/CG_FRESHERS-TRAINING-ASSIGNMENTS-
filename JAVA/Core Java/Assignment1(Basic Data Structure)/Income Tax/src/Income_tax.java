import java.util.Scanner;
public class Income_tax{

 public static void main(String[] args) {
  double tax=0,a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your income :");
  a=sc.nextDouble();
  if(a<=180000)
   tax=0;
  else if(a<=300000)
   tax=0.1*a;
  else if(a<=500000)
   tax=0.2*a;
  else
   tax=0.3*a;
	
  System.out.println("Income tax amount is "+tax);
 }

}