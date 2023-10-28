//factorial of a digit
import java.util.*;
class fac
{
	void facts()
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter the number");
		a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial = " +fact);
	}		
	public static void main(String []args)
	{
		fac f=new fac();
		f.facts();		
	}
}