//2d dimentional array
import java.util.*;
class md
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [][] a=new int[3][3];
		System.out.println("enter the number one by one");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the values are");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}