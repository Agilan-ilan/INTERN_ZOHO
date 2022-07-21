/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Implemented;

/**
 *
 * @author agilan
 */
public class Manager implements IPerson{
    
    String _firstname;
    String _lastname;
    ManagerAccount account=new ManagerAccount();
    
    Manager(String _firstname,String _lastname){
        this._firstname=_firstname;
        this._lastname=_lastname;
     }

    @Override
    public IAccounts getAccount() {
        return account; 
    }

    @Override
    public String getFirstname() {
        return _firstname; 
    }

    @Override
    public String getLastname() {
       return _lastname;
    }

    
    
}
