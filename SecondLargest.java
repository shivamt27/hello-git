import java.util.Scanner;
class Second {
  Scanner s=new Scanner(System.in);
int i;
  public void SLN(int n)
  {
    int[] arr=new int[12];
    for (i=0;i<n;i++) {
         arr[i]=s.nextInt();
		}
    System.out.println("The given array is:" );
    for (i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
		}
		int largest=arr[0];
		int secondLargest=arr[0];
		int i;
		
		for (i=0;i<n;i++) {
 
			if (arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
 
			} else if (arr[i]>secondLargest) {
				secondLargest=arr[i];
 
			}
		}
 
	System.out.println("\nSecond largest number is:"+secondLargest);
  }
	}

public class SecondLargest {
  public static void main(String[] args) {
   int n; 
Scanner s=new Scanner(System.in);
 Second ob= new Second();
     n=s.nextInt();
    ob.SLN(n);
  }
}