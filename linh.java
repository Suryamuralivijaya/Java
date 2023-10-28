//linked hassetd
import java.util.*;
class linh
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
//		set.remove(2);
		for(String str:set)
		{
			System.out.println(str);
		}
	}
}