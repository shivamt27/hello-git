import java.util.*;
class count
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int count=0,n=ch.length;
		for(int i=0;i<n;i++)
		{
			if (ch[i]==' ')
			count++;
		}
		System.out.println("Number of words:"+(count+1));
	}
}