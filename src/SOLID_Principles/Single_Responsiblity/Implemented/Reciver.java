/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.Single_Responsiblity.Implemented;

import java.util.Scanner;

/**
 *
 * @author agilan
 */
public class PersonDataReciver {
    static Person Recieve(){
        
        Scanner scan= new Scanner(System.in);
        Person people=new Person();
        
        System.out.println("Enter the First name");
        people._firstname=scan.nextLine();
        
        System.out.println("Enter the Last name");
        people._lastname=scan.nextLine();
        
        return people;
    }
}
