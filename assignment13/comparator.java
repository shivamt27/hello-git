import java.util.*;
class Student 
{
	int age;
	String name;
	char grade;

	Student(String a,char b,int c)
	{
		age=c;
		name=a;
		grade=b;
	}

	public String toString()
	{
		return age+" "+name+" "+grade;
	}
}
class AgeComp implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.age>s2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameComp implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return (s1.name).compareTo(s2.name);
	}
}
class comparator
{
	public static void main(String args[])
	
		{
		Student x=new Student("shivay",'b',13);
		Student y=new Student("shivam",'a',8);
		Student z=new Student("mayank",'c',9);
		  
	    TreeSet<Student> myset=new TreeSet<Student>(new NameComp());
		myset.add(x);
	    myset.add(y);
		myset.add(z);
		System.out.println("sort by name:");  
		System.out.println(myset);
	    TreeSet<Student> myset1=new TreeSet<Student>(new AgeComp());
	    myset1.add(x);
		myset1.add(y);
		myset1.add(z);
	    System.out.println("sort by age:"); 
		System.out.println(myset1);
	}
}