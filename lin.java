//linked list
import java.util.*;
class lin
{
	public static void main(String []args)
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("shakthi");
		al.add("Surya");
		al.add("saran");
		al.add("ajith");
		al.add("null");
		al.add(" ");
		al.remove(2);//removes the 2nd input-ie starts from 0
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}