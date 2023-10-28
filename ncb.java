//Example program for try and catch
class ncb
{
	public static void main(String []args)
	{
		try
		{
			int a=10,b=10;
			int c=a-b;
			System.out.println("wrong input"+a/c);
		}
		catch(Exception e)
		{
			System.out.println("output message"+e);
		}
	}
}
		