//how to write a content from one file to another
import java.io.FileOutputStream;  
public class fwrite
{
	public static void main(String [] args)
	{	
           try
		   {
             FileOutputStream fout=new FileOutputStream("JSYLA.txt");     
			 String s="Every one has indiviudual talent but no ones properly cares for it";
			 byte [] b=s.getBytes();
			 fout.write(b);
             System.out.println("File saved..."); 
			fout.close();			 
            }
			catch(Exception e)
			{
			System.out.println("File Not saved.."+e);
			}    	
      }    
}  
