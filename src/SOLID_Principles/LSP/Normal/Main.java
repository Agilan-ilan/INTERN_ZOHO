/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.LSP.Normal;

/**
 *
 * @author agilan
 */
public class Main {
    
    public static void main(String[] args){
    
    Manager manager=new Manager();
    manager._firstname="Neo";
    manager._lastname="Mark";
    manager.calculateSalaryPerMonth(1);
    
    Employee emp=new Employee();
    emp._firstname="Right";
    emp._lastname="Filler";
    emp.assignManager(manager);
    emp.calculateSalaryPerMonth(1);
    
    System.out.println("Manager "+"manager._firstname"+" is assigned to the Employee "+emp._firstname);
    
    
    }
}
