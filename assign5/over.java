class Animal
{
String breed;
String color;
public void speak()
{
breed="american";
color="blue";
System.out.println(breed+" "+color);
}
}
class Dog extends Animal
{
public void speak()
{
breed="german";
color="brown";
System.out.println(breed+" "+color);
} 

}
class Cat extends Animal
{
public void speak()
{
breed="africa";
color="black";
System.out.println(breed+" "+color);
} 

}
public class over{
public static void main(String args[])
{
Cat c=new Cat();
c.speak();}}