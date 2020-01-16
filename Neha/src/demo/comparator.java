package src.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{  
int rollno;  
String name;  
int age; 
String city;
Student1(int rollno,String name,int age ,String city){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
this.city=city;
}  
}  


class AgeComparator implements Comparator<Student1>{  
public int compare(Student1 s1,Student1 s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


class RollnoComparator implements Comparator<Student1>{  
public int compare(Student1 s1,Student1 s2){  
if(s1.rollno==s2.rollno)  
return 0;  
else if(s1.rollno>s2.rollno)  
return 1;  
else  
return -1;  
}  
}  



class NameComparator implements Comparator<Student1>{  
public int compare(Student1 s1,Student1 s2){  
return s1.name.compareTo(s2.name);  
}  
}  

class cityComparator implements Comparator<Student1>{  
public int compare(Student1 s1,Student1 s2){  
return s1.city.compareTo(s2.city);  
}  
} 




public class comparator {

	public static void main(String[] args) {
		
		ArrayList<Student1> al=new ArrayList<Student1>();  
		al.add(new Student1(101,"Vijay",23,"mumbai"));  
		al.add(new Student1(106,"Ajay",27,"america"));  
		al.add(new Student1(105,"Jai",21,"london"));  
		  
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student1 st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		System.out.println("---------------------------------");
		  
		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Travering the list again  
		for(Student1 st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		} 
		
		System.out.println("---------------------");
		
		System.out.println("sorting by roll no:");
		Collections.sort(al, new RollnoComparator());
		for(Student1 st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}
		
		
		System.out.println("---------------------");
		
		System.out.println("sorting by city no:");
		Collections.sort(al, new cityComparator());
		for(Student1 st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age+" "+st.city);  
			}
		
		

	}

}
