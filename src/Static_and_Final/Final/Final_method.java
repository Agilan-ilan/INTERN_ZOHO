/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_and_Final.Final;

/**
 *
 * @author agilan
 */

class Employee //class with a final method
 {
  final void printvalue() //Method declared as final in Java
  {
   System.out.println("Inside the class employee!!");
  }
 }
 class Final_method extends Employee //child class
 {
 void printvalue() //trying to override a final method   
        {
   System.out.println("Inside the class Test!!");
  }
 public static void main(String args[])
  {  
 Final_method e=new Final_method();  
 e.printvalue();
  }  
}  

