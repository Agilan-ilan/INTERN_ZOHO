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
public class CEO extends Employee{
    
    @Override
    public void calculateSalaryPerMonth(int rank){
        int baseAmount=3000000;
        _salary=baseAmount*rank;
    }
    
    @Override
    public void assignManager(Manager manager){
       System.out.println("CEO cannot have a manager ERROR");

    }
    
}
