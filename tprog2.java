//runable class
import java.io.*;
class th3 implements Runnable
{
	public th3()
	{
		Thread t=new Thread(this);//Thread declaration
		t.start();//to start thread
	}
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
					System.out.println("main"+i);
					Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)// InterruptedException should be given
		{
			System.out.println("Error in thread");
		}
		catch(Exception e)//Exception should be given
		{
			System.out.println(e);
		}
	}
}
			
class tprog2
{
	public static void main(String []args)
	{
		th3 t=new th3();
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("main"+i);
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}