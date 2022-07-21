/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Implemented;

import SOLID_Principles.OpenClose.Normal.*;
import SOLID_Principles.Single_Responsiblity.Normal.*;

/**
 *
 * @author agilan
 */
public class Person implements IPerson {
    String _firstname;

    @Override
    public String getFirstname() {
        return _firstname;
    }

    

    @Override
    public String getLastname() {
        return _lastname;
    }


    @Override
    public IAccounts getAccount() {
        return account;
    }

   
    String _lastname;
    public Accounts account=new Accounts();
    
    Person(String _firstname,String _lastname){
        this._firstname=_firstname;
        this._lastname=_lastname;
     }
    
}
