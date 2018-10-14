import java.util.*;
class comp 
{
	public static void main(String[] args) 
	{
        HashSet<String> myset1 = new HashSet<String>();
        myset1.add("tom");
        myset1.add("shiv");
        myset1.add("raju");
        myset1.add("russ");
        System.out.println("First HashSet:"+myset1);
        HashSet<String>myset2 = new HashSet<String>();
        myset2.add("tommy");
        myset2.add("suse");
        myset2.add("vivek");
        myset2.add("russ");
        System.out.println("Second HashSet:"+myset2);
        for(String str:myset1)
        {
            if(myset2.contains(str))
            {
              System.out.print(str+" ");
            }
        }
		 
	}
}