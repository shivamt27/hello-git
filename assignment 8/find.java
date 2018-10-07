import java.util.*;
class find
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();

		System.out.println("Enter a sub string");
		String str1=s.nextLine();
		if(str.contains(str1)==true)
		{
			System.out.println("Sub string found");
		}
		else
		{
		    System.out.println("Sub string not found");
		}  
	}
}