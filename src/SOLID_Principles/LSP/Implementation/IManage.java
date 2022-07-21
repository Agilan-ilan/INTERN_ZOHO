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
public interface IManage extends IEmployee{

    void assignManager(IManager manager);

    IManager getManager();
    
}
