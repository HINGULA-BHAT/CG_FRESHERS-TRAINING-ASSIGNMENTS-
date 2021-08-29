package Question3;

public interface BankAccountService {
	
	public double withdraw(long accountID,double balance);
	public double deposit(long accountID,double balance);
	public double getBalance(long accountID);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);

}
