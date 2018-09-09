interface Animals
{
	void speak();
	void eat();
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("Cat meows");
	}
	public void eat()
	{
		System.out.println("Cat Drinks milk");
	}
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
	public void eat()
	{
		System.out.println("Dog eats bone");
	}
}
public class inter
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