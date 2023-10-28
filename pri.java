//priority queue-prefrence
import java.util.*;
public class pri
{
		public static void main(String []args)
		{
			PriorityQueue<String> queue=new PriorityQueue<String>();//PriorityQueuesyntax
			queue.add("surya");
			queue.add("banana");
			queue.add("apple");
			queue.add("tyrion");
			queue.add("whity");
//			queue.add(null); NullPointerException when null values is placed
//			queue.add(" "); null values cannot be placed in proritu queu
			System.out.println("Head :"+queue.element());// returns the element at the front the container
			System.out.println("Head :"+queue.peek());//returns the first element
			System.out.println("Iterating the elements");
			Iterator itr=queue.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			queue.remove();//removes the first occuranceor randomly is removed
			queue.poll();//removes the head of the queue
			System.out.println("After removing the two elements");
			Iterator itr2=queue.iterator();
			while(itr2.hasNext())
			{
				System.out.println(itr2.next());
			}
		}
}
			
			