package demo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CrunchifyJSONFile
{

	public static void main(String[] args) throws IOException
	{
	
		
		JSONObject obj=new JSONObject();
		obj.put("1", "gaurav");
		obj.put("2", "gaffar");
		obj.put("3", "anu");
		
		
		JSONArray post=new JSONArray();
		post.add("post:manager");
		post.add("post:HR");
		
		obj.put("post_list", post);
		
		/*JSONArray post=new JSONArray();
		post.add("post");
		*/
		
		try (FileWriter file = new FileWriter("D:\\gaurav\\gaurav.txt")) {
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
			}
		
		
		}

	}


