package demo;

import java.io.File;

public class fileseperator
{

	public static void main(String[] args)
	{
		
		String ar[]= {"Fire_LP_0001","Fire_LP_0002","Fire_LP_0009","Fire_LP_0010","Fire_LP_0011"};
		
		File f=new File("D:\\ExecutionResultsSummary\\ExecutionResults_2019_03_28_09_57_11_IST\\TestNGResults\\ExecutionTestSuite_40");
		
		if(f.isDirectory())
		{
		
			File array[]=f.listFiles();
			 
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
	
		
			
			
		
		
		
		//System.out.println();
			
		}
		
		
		
	}

}
