Example program for thread
class thrr1
{
	public static void main(String []args)
	{
		th3 t=new th3();
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("main:"+i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread ");
		}
	}
}
class th2 extends Thread
{
	public th3()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("surya:"+i);
				Thread.sleep(7000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread"+e);
		}
	}
}