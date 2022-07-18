/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This;

/**
 *
 * @author agilan
 */

class Employee {
      // class attribute
int emp_no;
String name;

      //constructor parameter are same as class attribute e.g emp_name
Employee(int emp_no, String name) 
{
 emp_no = emp_no;//Ambiguity
 name = name;//Ambiguity
}

void display() 
{
 System.out.println(emp_no + " " + name);
}
}
public class Without_this {
public static void main(String args[]) 
{
 Employee e1 = new Employee(13, "Vaishnavi");
 e1.display();
}
}

