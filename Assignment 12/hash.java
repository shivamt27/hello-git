import java.util.*;
class Hash
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first name","shivam");
		hm.put("Last name","sharma");
		hm.put("address","meerut");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());  
		}
	}
}