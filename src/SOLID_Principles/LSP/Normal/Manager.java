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
public class Manager extends Employee{
    
    @Override
    public void calculateSalaryPerMonth(int rank){
        int baseAmount=1000000;
        _salary=baseAmount*rank;
    }
    
    public void genaratePerformence(){
        System.out.println("We have good progress in our project");
    }
}
