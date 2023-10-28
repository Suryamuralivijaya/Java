//program to show the employee salary details using inheritance
class employee
{
		int id;
		String name,dept;
		void employeeinfo(int i,String n,String d)
		{
			id=i;
			name=n;
			dept=d;
		}
}
	class salary extends employee
	{
		int basic,bonus,lop;
		void salaryinfo(int b,int bo,int l)
		{
			basic=b;
			bonus=bo;
			lop=l;
		}
		void display()
			{
				int total;
				System.out.println("Employee number="+id);
				System.out.println("Employee name="+name);
				System.out.println("Employee dept="+dept);
				System.out.println("Employee basic="+basic);
				System.out.println("Employee bonus="+bonus);
				System.out.println("Employee lop="+lop);
				total=basic+bonus-lop;
				System.out.println("Employee lop="+total);
			}
		public static void main (String [] args) 
		{
			salary sal = new salary();
			sal.employeeinfo(37,"Surya","mech");
			sal.salaryinfo(10000,5000,100);
			sal.display();
		}
	}

