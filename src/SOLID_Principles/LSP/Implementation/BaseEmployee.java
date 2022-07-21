/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.LSP.Implementation;

/**
 *
 * @author agilan
 */
public class BaseEmployee {
    String _firstname;
    String _lastname;
    protected int _salary;
    
    public String getFirstname() {
        return _firstname;
    }


    public String getLastname() {
        return _lastname;
    }

  
    public int getSalary() {
        return _salary;
    }

 
    public void setSalary(int salary) {
        salary= _salary;
    }
    

    public void calculateSalaryPerMonth(int rank){
        int baseAmount=100000;
        _salary=baseAmount*rank;
    }
}
