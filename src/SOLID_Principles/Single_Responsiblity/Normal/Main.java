package SOLID_Principles.Single_Responsiblity.Normal;

import static java.lang.System.out;
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
        
        
        Scanner scan= new Scanner(System.in);
        System.out.println("HI...welcome to our application");
        
        Person people=new Person();
        
        System.out.println("Enter the First name");
        people._firstname=scan.nextLine();
        
        System.out.println("Enter the Last name");
        people._lastname=scan.nextLine();
        
        
        if( people._firstname.isEmpty()){
            System.out.println("You haven't gave the entry");
        }
        if( people._lastname.isEmpty()){
             System.out.println("You haven't gave the entry");
        }
        
        System.out.println("...Thanks for using our application...");
    }
}
