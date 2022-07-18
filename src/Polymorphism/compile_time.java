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

class SimpleMultiplication
{
   
    /* Two different functions with same name */
    int multiply(int a, int b)
    {
         return a*b;
    }
    int  multiply(int a, int b, int c)  
    {
         return a*b*c;
    }
}

class Compile_time
{
   public static void main(String args[])
   {
       SimpleMultiplication num = new SimpleMultiplication();
       
       /* Calling functions */
       System.out.println(num.multiply(10, 20));
       System.out.println(num.multiply(10, 20, 30));
   }
}


