/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Implemented;

import SOLID_Principles.OpenClose.Normal.*;

/**
 *
 * @author agilan
 */
public class Accounts implements IAccounts {
  
    @Override
    public Employee createAccount(IPerson person){
        Employee employee =new Employee();
        employee._firstname=person.getFirstname()   ;
        employee._lastname=person.getLastname();
        employee._emailaddress=person.getFirstname()+"@gmail.com";
        
        return employee;
    }
}
