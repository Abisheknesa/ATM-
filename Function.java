package newas;

public class Vishnupr {
	int amount=90000;
	int deposit;
	int withdraw;
	int avail_bal;
	
	public void deposit(int dpt)
	{
		deposit=dpt;
		System.out.println("AMOUNT DEPOSIT :"+deposit);
		
	}
	
	public void withdraw(int wtw)
	{
		withdraw=wtw;
		System.out.println("AMOUNT WITHDRAW :"+withdraw);
	}
	
	public void display()
	{
		avail_bal=amount+deposit-withdraw;
		System.out.println("THE AVAILABLE BALANCE :"+avail_bal);
	}

	public static void main(String[] args) {
		
		Vishnupr abi =new Vishnupr();
		abi.deposit(0);
		abi.withdraw(5000);
		abi.display();
	}

}
