//method overloading
class gmail
{
	void call(String name, String depart)
	{
		String n=name;
		String d=depart;
		System.out.println("name=+n department"+d);
	}
	void call(int roll,int age)
	{
		int r=roll;
		int a=age;
		System.out.println("roll number"+r);
	}
	public static void main(String []args)
	{
		gmail g=new gmail();
		g.call("surya","mech");
		g.call(11,25);
	}
}
	