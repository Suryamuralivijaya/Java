import java.util.* ;
class paytm
{
int amt;
String ph;
void info(int am,String pho)
{
amt=am;
ph=pho;
}
}
class airtel extends paytm
{
	void arecharge()
	{
		int amount=amt;
		String Phone=ph;
		System.out.println("The Airtel Recharge Success"+amt+" "+ph);
	}
}
class jio extends paytm
{
	void jrecharge()
	{
		int amount=amt;
		String Phone=ph;
		System.out.println("The Jio Recharge Success"+amt+" "+ph);
	}
	public static void main(String [] args)
	{
	 	Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Airtel");
				airtel ar= new airtel();
				ar.info(500,"9840452312");
				ar.arecharge();
				break;
			case 2:
				System.out.println("Jio");
				jio j= new jio();
			    j.info(500,"7241523210");
				j.jrecharge();
				break;	
		    default:
				System.out.println("Invalid Choice");
				break;
		}
	}
}