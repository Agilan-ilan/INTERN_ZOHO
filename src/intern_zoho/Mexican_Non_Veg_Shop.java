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
public class Mexican_Non_Veg_Shop extends Non_Veg_Shop{
    
    @Override
    public void set_Shop(int custom_count) {
                System.out.println("inside the Mexican Shop");
                Waiter.getNextWaiter(custom_count,3);

    }
    
    public void greetings(){
                System.out.println("Welcome");

    }
    
}
