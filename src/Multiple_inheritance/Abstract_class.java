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
void Methodx();
void Methody();  
void Methodz();  
void Methodo();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class Sample implements Example{  
public void Methodz(){System.out.println("Java is fun.");}  
}  
  
class Demo extends Sample{  
public void Methodx(){System.out.println("X");}  
public void Methody(){System.out.println("Y");}  
public void Methodo(){System.out.println("Z");}  
}  
  

public class Abstract_class {  
public static void main(String args[]){  
Example x=new Demo();  
x.Methodx();  
x.Methody();  
x.Methodz();  
x.Methodo();  
}} 
