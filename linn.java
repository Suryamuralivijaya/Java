//linked hassetd
import java.util.*;
class linn
{
	public static void main(String []args)
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Surya");
		set.add("Saran");
		set.add("whity");
		set.add("tyrion");
		set.add("jon snow");
		set.add("cersei");
		set.remove("Surya");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}