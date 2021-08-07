import java.util.Scanner; 
 public class Division 
 { 
         public static void main(String[] args) 
     { 
            int x,y; 
            //Create scanner object to obtain input from keyboard 
            Scanner input=new Scanner(System.in); 
             try 
            { 
                System.out.print("Enter first integer : "); 
                x=input.nextInt();  //Read first integer 
                System.out.print("Enter second integer : "); 
                y=input.nextInt();  //Read second integer 
                System.out.println(x + " / " + y +" = " + (x/y)); 
            } 
            catch(ArithmeticException  e) 
            { 
            	System.out.println("Denominator Cannot be Zero while Division");
            	System.out.println("Program ends here"); 
            } 
       } 
 }
