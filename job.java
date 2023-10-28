//method overriding
import java.util.*;
class kvb
{
	void withdraw(int balance,int debit)
	{
		int total=balance-debit;
		System.out.println("the total amount is "+total);
	}
}
class job extends kvb
{
	void withdraw(int balance,int debit)
	{
		int total=balance-debit;
		System.out.println("the total amount is "+total);
	}
	public static void main(String []args)
	{
		job j=new job();
		j.withdraw(8000,200);
	}
}