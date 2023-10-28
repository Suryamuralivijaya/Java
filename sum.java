//Sum of a digit
import java.util.*;
class sum
{
	void num(int n)
	{
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of the digits ="+sum);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter the number");
		a=sc.nextInt();
		sum s=new sum();
		s.num(a);
	}
}