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
 class Final_variable 
 {
  final int id = 25;//variable initialised as final
  void printvalue()
  {
   /*
 Trying to change the value of final variable 
 gives compilation error
 */
   id  = 50;
  }
  public static void main(String args[])
  {  
   Final_variable e=new Final_variable();  
   e.printvalue();
  }  
} 

