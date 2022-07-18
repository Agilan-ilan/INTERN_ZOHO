/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Abstraction;

/**
 *
 * @author agilan
 */
interface D   // Interface 1
{
	public abstract void text1();    // Abstract method
}


interface E   // Interface 2
{
	public abstract void text2();   // Abstract method
}


class F implements D,E   // Interface is implemented
{

	// Abstract methods are overridden
	public void text1()  
	{
		System.out.println("Hello");
	}

	public void text2()
	{
		System.out.println("What's your name?");
	}
}


public class Abstract {
    public static void main(String[] args)
	{
     	F obj = new F(); // Create a C object
     	obj.text1();
     	obj.text2();
	}
}
