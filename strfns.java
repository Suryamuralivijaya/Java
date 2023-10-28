//String
class strfns
{
	public static void main(String []args)
	{
		String s="ROSE IS A BEAUTIFUL FLOWER";
		System.out.println(s.charAt(12));// to show the character in the above word
		String p="WHERE THERE IS WILL THERE IS THE WAY";
		System.out.println(p.contains("WAY"));//to check if the given word is there or now
		System.out.println(p.contains("POWER"));//to check if the given word is there or now
		String sq="java";
		String s1="JAVA";
		String s2="java";
		String s3="Welcome";
		System.out.println(sq.equals(s1));//to compare sq with the other words given
		System.out.println(sq.equals(s2));//to compare sq with the other words given
		System.out.println(sq.equals(s3));//to compare sq with the other words given
		String t="PROGRAM";
		String t1="Dotnet";
		String t2="program";
		String t3="DOM";
		System.out.println(t.equalsIgnoreCase(t1));//to compare t with the other words given ignoring upper or lower case
		System.out.println(t.equalsIgnoreCase(t2));//to compare t with the other words given ignoring upper or lower case
		System.out.println(t.equalsIgnoreCase(t3));//to compare t with the other words given ignoring upper or lower case
		String tp="KIRAN,KARTHIKEYAN,ARUN AND UMAYAL ARE THE BEST AND TALENTED STUDENT IN MY CLASS";
        char [] a=tp.toCharArray();//split the string into character by character and store in a char array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		String pm="THE SELFISH GAINT-TRESPASSERS PROSECUTED";
		String [] b=pm.split("");//used to split the string into part by part
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		String rm="THE CARTSIEAN EQUATION";
		System.out.println(rm.length());//to find the Length of the String 
         		
	}	

}
		
		