class Main{
  int lenght,breath;
  Main(int l,int b)
  {
    lenght=l;
    breath=b;
    int a=lenght*breath;
    System.out.println("The area of rectangle is:"+a);
  }
}
class Area {
  public static void main(String[] args) {
   Main ob=new Main(15,25);
  }
}