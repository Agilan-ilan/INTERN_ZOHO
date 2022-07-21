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
public class Messages {
    static void WelcomeMessage(){
        System.out.println("HI...welcome to our application");
    }
    
    static void SuccessMessage(){
         System.out.println("Your data has been saves Successfully");
    }
      
    static void NameErrorMessage(String Name){
         System.out.println("You haven't gave the entry for "+Name);
    }
    
    static void ExitMessage(){
         System.out.println("...Thanks for using our application...");
    }
}
