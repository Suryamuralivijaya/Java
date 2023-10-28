//program to get and show the employee salary details using inheritance
import java.util.*;
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
	class salaryy extends employee
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
			int ids;
			String names,depts;
			int basics,bonuss,lops;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id");
			ids=sc.nextInt();
			System.out.println("Enter the user name");
			names=sc.next();
			System.out.println("Enter the dept");
			depts=sc.next();
			System.out.println("Enter the salary details");
			basics=sc.nextInt();
			bonuss=sc.nextInt();
			lops=sc.nextInt();
			salaryy sal = new salaryy();
			sal.employeeinfo(ids,names,depts);
			sal.salaryinfo(basics,bonuss,lops);
			sal.display();
		}
	}

