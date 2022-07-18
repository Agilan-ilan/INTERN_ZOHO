/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_inheritance;

/**
 *
 * @author agilan
 */

interface Question_one   //First interface
{
    default void text()
    {
   		System.out.println("Hello");
    }
}

interface Question_two   //Second interface
{
    default void text()
    {
   		System.out.println("What's your name?");
    }
}

class Questions implements Question_one,Question_two
{

    public void text()   //Default method in interface is overriden
    {
   		Question_one.super.text();  //text() method from first interface is called
   		Question_two.super.text();  //text() method from second interface is called
    }
}

class Super
{
    public static void main(String args[])
	{
         Questions obj = new  Questions();
         obj.text();   
    }
}


