class print2{  
void print1(){System.out.println("hello");} 
  void print1(int a){System.out.println(a);}  
  void print1(float a){System.out.println(a);}  }
  public class print{
  public static void main(String args[]){  
  print2 obj=new print2();  
obj.print1();
  obj.print1(20);  
  obj.print1(20.1f);  
  
  }  
}  