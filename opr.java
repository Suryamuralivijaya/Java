class opr
{
	int a=21,b=7,c;
	void main()
	{
		c=a+b;
		System.out.println("Sum="+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Sub="+c);
	}
	void mul()
	{
		c=a*b;
		System.out.println("mul="+c);
	}
	public static void main(String []args)
	{ 
		opr op=new opr();
		op.main();
		op.sub();
		op.mul();
	}
}
		
	