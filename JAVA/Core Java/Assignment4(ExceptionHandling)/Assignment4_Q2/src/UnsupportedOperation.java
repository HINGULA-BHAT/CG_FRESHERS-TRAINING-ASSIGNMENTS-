import java.util.Scanner;

public class UnsupportedOperation {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a and b values:");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(b==0)
				throw new UnsupportedOperationException("UnsupportedOperationException");
			else {
			int c=a/b;
			System.out.println("The Result is: "+c);
			}
		}
		catch(UnsupportedOperationException e) {
			System.out.print(e);
		}
	}

}