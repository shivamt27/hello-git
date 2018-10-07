import java.util.*;
class reverse
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str,rev=" ";
		str=s.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			rev+=str.charAt(i);
        }
    System.out.println(rev);
    }
}