//Array deque--Double eneded queue which enables us to perform the operation on both sides
import java.util.*;
class dq
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
		deque.remove();
		deque.remove();
		for(String str:deque)
		{
			System.out.println(str);
		}
	}
}