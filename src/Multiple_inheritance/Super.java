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

interface A   //First interface
{
    default void text()
    {
   		System.out.println("Hello");
    }
}

interface B   //Second interface
{
    default void text()
    {
   		System.out.println("What's your name?");
    }
}

class C implements A,B
{

    public void text()   //Default method in interface is overriden
    {
   		A.super.text();  //text() method from first interface is called
   		B.super.text();  //text() method from second interface is called
    }
}

class Super
{
    public static void main(String args[])
	{
         C obj = new C();
         obj.text();   
    }
}


