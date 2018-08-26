import java.util.Scanner;
class Even
{
 public static void main(String args[])
 {
  int x,i;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number:");
  x=sc.nextInt();
  for(i=1;i<x;i++)
  {
   if(i%2==0)
   {
    System.out.println("it is even"+i);
   }
   else
   {
    System.out.println("it is not even"+i);
   }
  }
 }
}