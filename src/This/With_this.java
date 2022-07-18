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

class EmployeeA {
int emp_no;
String name;

EmployeeA(int emp_no, String name) 
{
 //this referring to class attribute here, resolving ambiguity
            this.emp_no = emp_no;
 this.name = name;
}

void display() 
{
 System.out.println(emp_no + " " + name);
}
}
public class With_this 
{
public static void main(String args[]) 
{
 EmployeeA e1 = new EmployeeA(13, "Vaishnavi");
 e1.display();
}
}

