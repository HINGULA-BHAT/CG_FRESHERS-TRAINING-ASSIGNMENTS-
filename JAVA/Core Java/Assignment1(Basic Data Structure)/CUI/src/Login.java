import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String username="Hingula";
		String password="password";
		
		for(int i=0;i<=2;i++) {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("enter pass");
			String pass = sc.next();
			if(username.equals(name) && password.equals(pass)) {
				System.out.println("Welcome"+" " +name);
				break;
				
			}
			count++;
		}
		if(count>=3) {
			System.out.println("Contact Admin");
		}
	}

}