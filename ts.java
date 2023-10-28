//linked hassetd
import java.util.*;
class ts
{
	public static void main(String []args)
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("Surya");
		set.add("Saran");
		set.add("whity");
		set.add("tyrion");
		set.add("jon snow");
		set.add("cersei");
		set.remove("Surya");//removes the lement given in the bracket
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}