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
public class CEO extends BaseEmployee implements IManager{
    
    @Override
    public void calculateSalaryPerMonth(int rank){
        int baseAmount=3000000;
        _salary=baseAmount*rank;
    }
   

    @Override
    public void genaratePerformence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
