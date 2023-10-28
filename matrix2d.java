//2dimentional array
import java.util.*;
class matrix2d
{		
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][] a= new int [3][3];
		System.out.println("enter the numbers for the matrix");
		for(int i=0;i<3;i++)
			{		
				for(int j=0;j<3;j++)
					{
						a[i][j]=sc.nextInt();
					}
			}
		for(int i=0;i<3;i++)
			{		
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+"/t");
				}
			System.out.println();
			}
	}
}
		
	
