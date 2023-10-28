//Array deque--Double eneded queue which enables us to perform the operation on both sides using iteration
import java.util.*;
class dqq
{
	public static void main(String []args)
	{
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Surya");
		deque.add("Saran");
		deque.add("Shakthi");
		deque.add("whity");
		deque.add("jon snow");
//		deque.remove(null);
		deque.remove();//removes the first elememt 
		deque.remove();
		Iterator itr=deque.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}