/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.Single_Responsiblity.Implemented;

/**
 *
 * @author agilan
 */
public class PersonValidator {
    
    static boolean Validator(Person person){
        if( person._firstname.isEmpty()){
            Messages.NameErrorMessage("FirstName");
            return false;
        }
        if( person._lastname.isEmpty()){
             Messages.NameErrorMessage("LastName");
             return false;
        }
        return true;
}
}
