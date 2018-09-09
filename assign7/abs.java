import java.util.*;
import java.lang.*;

abstract class Animals
{
	String color,breed,name;
	abstract void eat();
	void speak(){}
}
class Cat extends Animals
{
	void eat()
	{
		System.out.println("Cat drinks milk");
	}
	void speak()
	{
		System.out.println("Cat meows");

	}
}
class Dog extends Animals
{
	void eat()
	{
		System.out.println("Dog eats bone");
	}
	void speak()
	{
		System.out.println("Dog barks");

	}
}
public class abs
{
	public static void main(String args[])
	{
		Cat c1=new Cat();
		Dog d1=new Dog();
		c1.speak();
		c1.eat();
		d1.speak();
		d1.eat();
	}
}