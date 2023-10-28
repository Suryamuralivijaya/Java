import java.util.*;
class prime
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a new number");
		a=sc.nextInt();
		if(isPrime(a))
		{
			System.out.println("the given number is prime"+a);
		}
		else
		{
			System.out.println("the given number is not an prime");
		}
	}
}