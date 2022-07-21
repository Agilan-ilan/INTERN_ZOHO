/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.LSP.Implementation;

import SOLID_Principles.LSP.Normal.*;

/**
 *
 * @author agilan
 */
public class Manager extends Employee implements IManager{
    
    @Override
    public void calculateSalaryPerMonth(int rank){
        int baseAmount=1000000;
        setSalary(baseAmount*rank);
    }
    
    @Override
    public void genaratePerformence(){
        System.out.println("We have good progress in our project");
    }
}
