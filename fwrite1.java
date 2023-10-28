import java.util.*;
public class fwrite1
{
	public static void main(String [] args)
	{
		try
		{
//			FileOutputStream fout=new FileOutputStream("Saran.txt");
			FileOutputStream fout=new FileOutputStream("SARAN.txt");  
			String s="Hi, epdi iruka nala irukiya";
			byte []b=s.getBytes();
			fout.write(b);
			System.out.println("File save");
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println("file not saved");
		}
	}
}