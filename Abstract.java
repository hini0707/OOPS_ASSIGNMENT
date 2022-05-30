package com.oops.Assign;
abstract class mock
{
	void display()
	{
System.out.print("abstract class without abstract methods is possible");
}
	final void method()
	{
	System.out.println("their can be final method in abstract class but not abstract final method");	
	}
	static void s()
	{
		System.out.println("we can have static methods");
	}
}

class gg extends mock
{
	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		mock.s();
		System.out.println("we cannot instiate abstract class");
	}

}

