package demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map
{

	public static void main(String[] args) 
	{
		
		/*Map m=new TreeMap();
		
		m.put(1, "dlkefd,fdfm");
		m.put(2, "dfkdfd");
		m.put(5, "dfgdfm");
		m.put(3, "sattar");
		m.put(4, "khan");
		*/
		
		
		Map m=new Hashtable();
		m.put(1, "ajay");
		m.put(2, "dnd");
		m.put(5, "dfgdfm");
		m.put(4, "sattar");
		m.put(3, "khan");
		
		
		
		//System.out.println(m);
		
		
		m.remove(4);
		System.out.println(m);
		
		/*Set s=m.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

		
		/*Iterator it=m.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
*/		
	}

}
