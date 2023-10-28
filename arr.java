//example of arraylist
import java.util.*;	
class arr
{
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<String>();//Arraylist syntax
		list.add("Surya");
		list.add("vijay");
		list.add("ajith");
		list.add("null");
		list.add(" ");
		list.remove(2);//removes the 2nd input-ie starts from 0
		Iterator itr=list.iterator();//Iterator syantax
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}