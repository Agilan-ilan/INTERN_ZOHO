/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author agilan
 */
interface Question_Text   // Interface 1
{
	public abstract void text_Q();    // Abstract method
}


interface Statement_Text   // Interface 2
{
	public abstract void text_S();   // Abstract method
}


class Text implements Statement_Text,Question_Text   // Interface is implemented
{

	// Abstract methods are overridden
	public void text_Q()  
	{
		System.out.println("Hello");
	}

	public void text_S()
	{
		System.out.println("What's your name?");
	}
}


public class Abstract {
    public static void main(String[] args)
	{
     	Text obj = new Text(); // Create a Text object
     	obj.text_Q();
     	obj.text_S();
	}
}
