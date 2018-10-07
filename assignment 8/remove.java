import java.util.Scanner;

class remove
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=s.nextLine(),str2;
		str2=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after removing vowels:-");
		System.out.println(str2);
    }
}