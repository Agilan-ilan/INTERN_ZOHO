/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_and_Final.Final;

import Static_and_Final.Final.Employee;

/**
 *
 * @author agilan
 */

 final class EmployeeC {}//final class in Java
 class Final_class extends Employee//trying to extend a final class
 {
 void printvalue()
  {
   System.out.println("Inside the class Test!!");
  }
 public static void main(String args[])
  {  
   Final_class e=new Final_class();  
   e.printvalue();
  }  
}

