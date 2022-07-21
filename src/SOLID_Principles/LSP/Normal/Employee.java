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
public class Employee {
    
    String _firstname;
    String _lastname;
    protected int _salary;
    Manager _manager;
    
    public void assignManager(Manager manager){
        _manager=manager;
    }
    
    public void calculateSalaryPerMonth(int rank){
        int baseAmount=100000;
        _salary=baseAmount*rank;
    }
}
