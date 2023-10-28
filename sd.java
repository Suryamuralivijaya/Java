//Single dimentional array
class sd
{
	public static void main(String [] args)
	{
		int [] a={79,88,45,412,56};
		int max=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the largest number in the array"+max);
	}
}
			