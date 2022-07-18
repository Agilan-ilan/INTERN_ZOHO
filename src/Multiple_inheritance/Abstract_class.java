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

interface Example{  
void Example_one();
void Example_two();  
void Example_three();  //to be defined by abstract class
void Example_four();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class Sample implements Example{  
    @Override
public void Example_three(){System.out.println("Defined by abstract class Example_three");}  
}  
  
class Demo extends Sample{  
@Override
public void Example_one(){System.out.println("In Example_one");} 
@Override
public void Example_two(){System.out.println("In Example_two");}  
@Override
public void Example_four(){System.out.println("In Example_four");}  
}  
  

public class Abstract_class {  
public static void main(String args[]){  
Example Ex=new Demo();  
Ex.Example_one();  
Ex.Example_two();  
Ex.Example_three();  
Ex.Example_four();  
}} 
