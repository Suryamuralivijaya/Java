//jagged Array
import java.util.*;
class jag
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];
		System.out.println("enter the valus");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");//to give spaces
			}
			System.out.println();//to give a new line
		}
	}
}