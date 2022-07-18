/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Multiple_inheritance;

/**
 *
 * @author agilan
 */

interface Example{  
void x();
void y();  
void z();  
void o();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class Sample implements Example{  
public void z(){System.out.println("Java is fun.");}  
}  
  
class Demo extends Sample{  
public void x(){System.out.println("X");}  
public void y(){System.out.println("Y");}  
public void o(){System.out.println("Z");}  
}  
  

public class Abstract_class {  
public static void main(String args[]){  
Example x=new Demo();  
x.x();  
x.y();  
x.z();  
x.o();  
}} 
