//factorial of a digit
import java.util.*;
class fact
{
	void facts(int b)
	{
		long fact=1;
		for(int i=1;i<=b;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial = " +fact);
	}		
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter the number");
		a=sc.nextInt();
		fact f=new fact();
		f.facts(a);		
	}
}