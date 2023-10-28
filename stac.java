//Stack example
import java.util.*;
class stac
{
	public static void main(String []args)
	{
		Stack<String> stack=new Stack<String>();
		stack.push("surya");//push is used for adding the element
		stack.push("shakthi");
		stack.push("saran");
		stack.push("tyrion");
		stack.push("whity");
		stack.push("udhay");
		stack.push("logesh");
		stack.push("surya");
		stack.push("surya");
		stack.pop();
		stack.pop();//removes the last element last in first out
		Iterator itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}