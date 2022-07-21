/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.DIP.Implemented;

import SOLID_Principles.DIP.normal.*;

/**
 *
 * @author agilan
 */
public class BuinessLayerLogic {
    
    private IRepositaryLayer datalayer;
    
    public BuinessLayerLogic(IRepositaryLayer datalayer){
        this.datalayer=datalayer;
    }
    public void Save(Object details){
        datalayer.save(details);       
    }
  
}
