class BankAcc{
	double totalAmt;
	BankAcc(){}
	BankAcc(double totalAmt){
		this.totalAmt=totalAmt;
	}
	
	double totalAmount() {
		return totalAmt;
	}
}
class Saving extends BankAcc
{
	double fixedDeposit;
	Saving(double fixedDeposit){
		this.fixedDeposit=fixedDeposit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=fixedDeposit);		
	}
}
class Current extends BankAcc
{
	double cashCredit;
	Current(double cashCredit){
		this.cashCredit=cashCredit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=cashCredit);		
	}
}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc b = new BankAcc();
		Saving s=new Saving(500000);
		b.totalAmt=s.totalAmount();
		Current c=new Current(50000);
		b.totalAmt=b.totalAmt+c.totalAmount();
		
		System.out.println("total amount in the bank is Rs."+b.totalAmt);
	}

}
