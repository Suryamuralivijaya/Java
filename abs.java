//abstract class having constructor,data member anbd methods
abstract class bike
{
	bike()
	{
		System.out.println("Bike is ready");
	}
	abstract void run();
	void safety()
	{
		System.out.println("Gear is changed");
	}
}
class honda1 extends bike
{
	void run()
	{
		System.out.println("honda is ready");
	}
}
class abs
{
	public static void main(String [] args)
	{
		bike obj=new honda1();
		obj.run();
		obj.safety();
	}
}
	