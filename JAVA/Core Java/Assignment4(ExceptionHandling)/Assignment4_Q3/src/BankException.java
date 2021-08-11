import java.util.Scanner;
class insufficientBalanceException extends Exception {
	
}
class IllegalBankTransactionException extends Exception {
	
}
class Savings
{
	double balance;
	Savings(double balance){
		this.balance=balance;
	}
	public double withdraw(double amount)
	{
	try
	{
		if(balance==0 || amount>balance) 
		{
			throw new insufficientBalanceException();
		}
		else if(amount<0) {
			throw new IllegalBankTransactionException();
		}
		else 
		{
			balance=balance-amount;
			System.out.println("Balace amount is RS. "+balance);
		}
	}
	catch(insufficientBalanceException e)
	{
		System.out.println("Insufficient Balanace... Check and please try later!");
		e.printStackTrace();
	}
	catch(IllegalBankTransactionException e)
	{
		System.out.println("Illegal attempt...Enter a valid amount!.");
		e.printStackTrace();
	}
		return amount;	
	}
	public double Deposit(double amount)
	{
		balance+=amount;
		return balance;
	}
	
}


public class BankException {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Employee ID: ");
		long id=sc.nextInt();
		Savings s=new Savings(500.0);
		System.out.print("Enter 1 to withdraw and 2 to deposit: ");
		int option=sc.nextInt();
		if(option==1) 
		{
			System.out.print("Enter the amount to be withdraw : ");
			int t=sc.nextInt();
			s.withdraw(t);
		}
		else if(option==2) {
			System.out.print("Enter the amount to deposit :Rs.");
			double amount=sc.nextDouble();
			System.out.println("Balance in the Account is Rs. "+s.Deposit(amount));
		}
		else {
			System.out.println("Choose a valid option.");
		}
	}

}