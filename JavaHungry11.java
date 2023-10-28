public class JavaHungry11
{
	public static void main(String []args)
	{
		try
		{
			int a[]={12,23,36,65,54};
			for(int i=0;i<=5;i++)
			{
				 System.out.print ("Array elements are : " + a[i] + "\n"); 
			}
		}
			catch(Exception e)
			{
				System.out.print ("Exception"+e); 
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.print ("ArrayIndexOutOfBoundsException"+ex); 
			}
	}
		
}