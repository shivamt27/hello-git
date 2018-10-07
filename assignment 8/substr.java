import java.util.*;

class substr
{
	static void sub(String str)
	{
		int n=str.length();
		System.out.println("Substrings are:");
		for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)

                 System.out.println(str.substring(i,j));
    }
	public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=s.nextLine();
    sub(str);
  }
}