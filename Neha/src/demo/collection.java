package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class collection 
{

	public static void main(String[] args)
	{
		
		
		/*List l1=new ArrayList();*/
		List l1=new Vector();
		l1.add("hi");
		l1.add("this");
		l1.add("is");
		l1.add("colection");
		l1.add("framweork");
		
		
		Iterator it=l1.iterator();
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
*/
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		Stack v1=new Stack();
		
		v1.push(1);
		v1.push(2);
		v1.push(3);
		
		System.out.println("element at head is : "+v1.peek());
		
		Iterator it1=v1.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	
		
	}

}
