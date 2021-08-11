
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Scanner;


public class oddlength {

    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){

		Predicate<String> pre = e -> e.length()% 2 != 0; 
    	employeeList.removeIf(pre);  	
    	return employeeList;
    }



    public static void main(String[] args) {

    	Scanner ss= new Scanner(System.in);

    	ArrayList<String> al= new ArrayList<String>();

    	System.out.print("enter the number of Strings you want to insert : ");
    	int i= ss.nextInt();

    	for (int j=1;j<=i;j++){

	    	System.out.print("enter the string "+j+" : ");
	    	String s= ss.next();

	    	al.add(s);

    	}

    	new oddlength().removeOddLength(al).forEach(n -> System.out.println(n));

    }
}