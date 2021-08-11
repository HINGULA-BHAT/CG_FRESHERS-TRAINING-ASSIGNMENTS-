
import java.util.*;

@FunctionalInterface
interface Operation{double math(int a,int b);}

public class Arithmetic {

    public double addition(int num1,int num2){ 
    	Operation a= (int num,int nu) -> num+nu; 
    	return a.math(num1, num2);}

    public double subtraction(int num1,int num2){ 
    	Operation s= (int num,int nu)-> num-nu; 
    	return s.math(num1, num2);}

    public double multiplication(int num1,int num2){ 
    	Operation m= (int num,int nu)-> num*nu; 
    	return m.math(num1, num2);}

    public double division(int num1,int num2){ 
    	Operation d= (int num,int nu)-> (nu==0)?0:num/(double)nu; 
    	return d.math(num1, num2);}

    	

    public static void main(String[] args) {

    	Scanner ss= new Scanner(System.in);
    	
    	System.out.println("enter values : ");
    	int a= ss.nextInt();
    	int b= ss.nextInt();

    	Arithmetic o= new Arithmetic();
 
    	System.out.println("sum : "+o.addition(a,b));
    	System.out.println("difference : "+o.subtraction(a,b));
    	System.out.println("product : "+o.multiplication(a,b));
    	System.out.println("division : "+o.division(a,b));

    }
}