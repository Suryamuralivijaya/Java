//vector
import java.util.*;
class vec
{
	public static void main(String []args)
	{
		Vector<String> v=new Vector<String>();
		v.add("Surya");
		v.add("amit");
		v.add("Ashish");
		v.add("Garima");
		v.add("Garima");
		v.add(null);
		v.add(null);
		v.remove(2);
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
