/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author agilan
 */

class Parent{
   public void myMethod(){
    System.out.println("Overridden Method");
   }
}
class Child extends Parent{

   public void myMethod(){
    System.out.println("Overriding Method");
   }
  
   
}

public class Run_time{
    public static void main(String args[]){
       
    
    Parent obj = new Child();
    obj.myMethod();
    
   }
}

