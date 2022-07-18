/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_and_Final.Static;

/**
 *
 * @author agilan
 */

 public class Static
 {
  public static void main(String args[]) 
  {
  //Static method is being called using the name of the class
  StaticClass.callme();
  //Static variable is accessed with the class name
  System.out.println("The value of b = " + StaticClass.b);
  }
}
