final class xyz{
void display(){
System.out.println("This class cannot be extended further");
}
}
class notex {
public static void main(String args[]){
xyz obj=new xyz();
obj.display();
}
}