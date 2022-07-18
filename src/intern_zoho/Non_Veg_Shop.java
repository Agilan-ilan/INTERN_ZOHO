/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intern_zoho;

import static intern_zoho.Veg_Shop.Waiter;

/**
 *
 * @author agilan
 */
public class Non_Veg_Shop implements Shop_Factory {

    static Waiter_Selection_Pool Waiter=Waiter_Selection_Pool.getTableServers();
    
    @Override
    public void set_Shop(int custom_count) {
                System.out.println("inside Non Veg Shop");
                Waiter.getNextWaiter(custom_count,2);

    }
    
}

