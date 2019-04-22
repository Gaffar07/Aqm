package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set 
{

	public static void main(String[] args)
	{
		
		
		
		/*Set s=new HashSet();*/
		
		/*Set s=new LinkedHashSet();*/
		
		Set s=new TreeSet();
		
		
		s.add(5);
		s.add(1);
		s.add(4);
		s.add(3);
		s.add(3);
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(4);
		s.add(1);

		Iterator it=s.iterator();
		
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
