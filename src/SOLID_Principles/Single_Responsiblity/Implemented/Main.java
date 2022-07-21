package SOLID_Principles.Single_Responsiblity.Implemented;

import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agilan
 */
public class Main {
    
    public static void main(String args[]){
        

        Messages.WelcomeMessage();
          
        Person person=PersonDataReciver.Recieve();
         
        boolean isValid=PersonValidator.Validator(person);
        
        if(!isValid){
            Messages.ExitMessage();
            exit(1);
        }
        Messages.SuccessMessage();
        Messages.ExitMessage();
    }
}
