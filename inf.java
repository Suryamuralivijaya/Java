//Abstract class using Interface
interface A
{
void a();
void b();
void c();
void d();
}
abstract class B implements A //abstract class using implement keyword 
{
	public void c()
	{
		System.out.println("I am C");
	}
}
class H extends B
{	
	public void a()
	{
		System.out.println("I am A");
	}
	public void b()
	{
		System.out.println("I am B");
	}
	public void d()
	{
		System.out.println("I am D");
	}
}
class inf
{
	public static void main(String [] Args)
	{
		A obj=new H();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}