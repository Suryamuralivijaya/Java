//subclass extends thread
class thr1
{
	public static void main(String []args)
	{
		th2 t=new th2();
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("main"+i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("main thread interrupted");
			System.out.println("main thread ");
		}
	}
}
class th2 extends Thread
{
	public th2()
	{
		Thread t=new Thread(this);//to create a thread we need to call 
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("chilled"+i);
				Thread.sleep(7000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("error in thread");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		}
	}	
			