/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.OpenClose.Normal;

import SOLID_Principles.Single_Responsiblity.Normal.*;

/**
 *
 * @author agilan
 */
public class Person {
    String _firstname;
    String _lastname;
    EmployeeType _type;
    
    Person(String _firstname,String _lastname,EmployeeType _type){
        this._firstname=_firstname;
        this._lastname=_lastname;
        this._type=_type;
    }

}
