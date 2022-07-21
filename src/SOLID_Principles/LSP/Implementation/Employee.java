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
public class Employee extends BaseEmployee implements IManage {

   Manager _manager;
   
    @Override  
    public Manager getManager() {
        return _manager;
    }

    @Override
    public void assignManager(IManager manager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
