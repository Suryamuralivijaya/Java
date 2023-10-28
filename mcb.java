//Example program for try and catch
class mcb
{
	public static void main(String []args)
	{
		try
		{
			String s="null";//
			System.out.println("the length of s ="+s.length());
		}
		catch (ArithmeticException a)
		{
			System.out.println("can't divide a number by zero");
		}
		catch (ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Out of bounds="+ar);
		}
		catch (Exception e)
		{
			System.out.println("Exception handled = "+e);
		}
		System.out.println("rest of codes");
	}
}
		