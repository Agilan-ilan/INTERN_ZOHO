/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Normal;

/**
 *
 * @author agilan
 */
public class Accounts {
    public Employee createAccount(Person person){
        Employee employee =new Employee();
        employee._firstname=person._firstname   ;
        employee._lastname=person._lastname;
        employee._emailaddress=person._firstname+"@gmail.com";
        
        switch(person._type){
            case Staff:
                break;
            case Manager:
                employee.isManager=true;
                break;
            case Executive:
                employee.isExecutive=true;
                break;
                
        }
        return employee;
    }
}
