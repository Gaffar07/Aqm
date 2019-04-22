package demo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Delete_01 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
    {

    	JSONParser parser = new JSONParser();
    	JSONArray a = (JSONArray) parser.parse(new FileReader("D:\\gaffar\\file.json"));

    	  for (Object o : a)
    	  {
    	    JSONObject person = (JSONObject) o;

    	    String name = (String) person.get("name");
    	    System.out.println("name is : "+name);

    	    String city = (String) person.get("city");
    	    System.out.println("city is : "+city);

    	    String job = (String) person.get("job");
    	    System.out.println("designation is : "+job);

    	    JSONArray cars = (JSONArray) person.get("cars");

    	    for (Object c : cars)
    	    {
    	      System.out.println("Car is :  "+c+"");
    	    }
    	    
    	    
    	    System.out.println("----------------------------");
    	  }
    	  
    }
}