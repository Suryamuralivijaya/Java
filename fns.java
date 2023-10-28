//finally block will not execute
class fns
{
	public static void main(String [] args)
	{
		try
		{
		 for(int i=1;i<=10;i++)
		 {
			 if(i<=6)
			 {
				 System.out.println(i);
			 }	
			 else
			 {
				  System.out.println("end");
				 	System.exit(0);	 
			 }
		 }
		}
		 
		catch(Exception e)
		{
		System.out.println("String is empty");

		}
		finally
		{
		System.out.println("Finally block always executed");
		}
		
		System.out.println("Rest of codes");
		
	}
}