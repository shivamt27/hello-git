import java.util.*;
class ArrayDemo
	{
		public static void main(String[] args)
			{
			ArrayList <String> l1=new ArrayList <String>();
			l1.add("rohit");		
			l1.add("shivam");
			l1.add("shuk");
			l1.add("tom");
			System.out.println(l1);
			l1.add(1,"mayank");
			System.out.println("After adding element At paricular index:"+l1);
			l1.remove(2);
			System.out.println("After removing the element at particular index:"+l1 );
			System.out.println("Getting element an by index:"+l1.get(2));
			System.out.println("Searching element in arraylist:"+l1.contains("tom"));
			Iterator it=l1.iterator();
			while(it.hasNext())
			{
				String str=(String)it.next();
				System.out.println(str);
			}
			ArrayList <String> l2=new ArrayList <String>();
			l2.addAll(l1);
			l2.add("tom");
			System.out.println("This ia new array of size 1.5 times the previous array:"+l2);
		}
	}