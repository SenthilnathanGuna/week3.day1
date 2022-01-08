package bank;

public class AxisBank extends BankInfo
{

	public void deposit()
	{
		System.out.println("Calling method 'deposit' from child");
		
	}
	
	public static void main(String[] args) 
	{
		AxisBank axisBankobj = new AxisBank();
		
		axisBankobj.deposit();

	}

}
