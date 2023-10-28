//throw example program
class throwexampleprogram	
{	
	void age(int age)
	{
		if(age>23)
		{
			System.out.println("person is eligible for gold loan");
			System.out.println("Loan is being processed");
		}
		else 
		{
			throw new ArithmeticException("Invalid age");
		}
			System.out.println("click here for gold loan");
	}
	public static void main(String []args)
	{
		throwexampleprogram th=new throwexampleprogram();
		th.age(21);
	}
}
			
