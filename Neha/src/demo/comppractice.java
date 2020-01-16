package src.demo;

import java.util.ArrayList;
import java.util.Collections;

class student2 implements Comparable<student2>
{
	 int age;
	
	public student2(int age)
	{
		this.age=age;
	}

	public int compareTo(student2 st) {
		if(age==st.age)
		
		return 0;
		
		else if(age>st.age)
		
			return 1;
		
		else
		
			return -1;
	}

	
}

public class comppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<student2> a1=new ArrayList<student2>();
		
		a1.add(new student2(104));
		a1.add(new student2(101));
		a1.add(new student2(106));
		a1.add(new student2(109));
		a1.add(new student2(100));
		
		Collections.sort(a1);
		
		for(student2 st:a1)
		{
			System.out.println(st.age);
		}

	}

}
