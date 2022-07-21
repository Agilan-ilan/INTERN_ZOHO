/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Normal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agilan
 */
public class Main {
 
    
    public static void main(String[] args){
        
        List<Person> applicants=new ArrayList<>();
        
        applicants.add(new Person("","",EmployeeType.Staff));
        applicants.add(new Person("","",EmployeeType.Manager));
        applicants.add(new Person("","",EmployeeType.Executive));
        
        List<Employee> employees=new ArrayList<>();
        Accounts accounts=new Accounts();

        for(Person person : applicants){
            employees.add(accounts.createAccount(person));
        }
        
        for(Employee employee : employees){
            System.out.println("Employee Details:\n"+employee._firstname+" "+employee._lastname+" "+employee._emailaddress+" Manager"+employee.isManager+" Executive"+employee.isExecutive);
        }
        
        
    }
}
