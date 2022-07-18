/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author agilan
 */
interface Assets{  
float approximatedepreciation();  
}  
class Car implements Assets{  
public float approximatedepreciation(){return 8.75f;}  
}  
class Machine implements Assets{  
public float approximatedepreciation(){return 12.6f;}  
}  
  
public class Interface {
    public static void main(String[] args){  
Assets b=new Car();  
System.out.println("Depreciation: "+b.approximatedepreciation());  
}
}
