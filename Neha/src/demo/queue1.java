package demo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue1
{

	public static void main(String[] args) 
	{
		
		/*Queue q1=new PriorityQueue();*/
		Queue q1=new ArrayDeque();
		
		
		//Queue q1=new LinkedListqueue();
		
		q1.add('g');
		q1.add('a');
		q1.add('f');
		q1.add('f');
		q1.add('a');
		q1.add('r');
		
	System.out.println("top is : "+q1.peek());
		
		//System.out.println(q1);
		
		
		Iterator it=q1.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
