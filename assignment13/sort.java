import java.util.*;
 class genericsort
 {

	public static void main(String[] args) 
     {
		 ArrayList<String> s1=new ArrayList<String>();
		 s1.add("shivay");
		 s1.add("shivam");
		 s1.add("piyush");
		 Collections.sort(s1);
		 System.out.println(s1);

		 ArrayList<Integer> s2=new ArrayList<Integer>();

		 s2.add(1);
		 s2.add(2);
		 s2.add(3);
		 Collections.sort(s2);
		 System.out.println(s2);
	}

}