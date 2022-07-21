/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Implemented;

import SOLID_Principles.OpenClose.Normal.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agilan
 */
public class Main {
 
    
    public static void main(String[] args){
        
        List<IPerson> applicants=new ArrayList<>();
        
        applicants.add(new Person("Sanjith","Kumar"));
        applicants.add(new Manager("Ranjith","Raj"));
        
        IPerson p=new Person("","");
        
        List<Employee> employees=new ArrayList<>();
        

        for(IPerson person : applicants){
            employees.add(person.getAccount().createAccount(person));
        }
        
        for(Employee employee : employees){
            System.out.println("Employee Details:\n"+employee._firstname+" "+employee._lastname+" "+employee._emailaddress+" Manager:"+employee.isManager);
        }
        
        
    }
}
