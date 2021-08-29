package Question3;

public interface BankAccountRepository {
	
	public double getBalance(long accountID);
	public double updateBalance(long accountID,double newBalance);

}
