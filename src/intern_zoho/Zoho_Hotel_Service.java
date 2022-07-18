/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intern_zoho;

import java.util.Scanner;


/**
 *
 * @author agilan
 */
public class Zoho_Hotel_Service {
    
    static Waiter_Selection_Pool Waiter=Waiter_Selection_Pool.getTableServers();
    static int shop_no;
    Shop_Factory Shop;
    Scanner scan=new Scanner(System.in);
    static int custom_count=1;
    static double random;
    
    public Zoho_Hotel_Service(){
        
        System.out.println("***** WE GLADLY WELCOME YOU TO OUR ZOHO-HOTEL-SERVICES *****");
        
        do{
            
        System.out.println("********************************************************************");    
        System.out.println("Customer "+ custom_count);
        System.out.println("Choose the Shop you want to visit by clicking its corresponding Number: ");
        System.out.println("1.Veg ");
        System.out.println("2.Non-Veg ");
        System.out.println("3.Mexican ");        
        
        shop_no= scan.nextInt();   
            
        System.out.println("********************************************************************");  
        
        
        switch(shop_no){
            case 1:
                System.out.println("\n[YOU HAVE CHOSEN VEG SHOP]");
                Shop=new Veg_Shop();
                open_Shop(Shop);
                break;
            
            case 2:
                Shop=new Non_Veg_Shop();
                System.out.println("\n[YOU HAVE CHOSEN NON-VEG SHOP]");
                open_Shop(Shop);
                break;
                
            case 3:
                Shop=new Mexican_Non_Veg_Shop();
                System.out.println("\n[YOU HAVE CHOSEN MEXICAN SHOP]");
                open_Shop(Shop);
                break;    
                
            default:
                System.out.println("Choose the correct option...TRY AGAIN ");
                
                                                     
        }
        for(int i=1;i<=custom_count;i++){
                System.out.println("--->Do Customer "+ i+" want to exit?(1/0)");
                int exit=scan.nextInt();  
                if(exit==1){
                    Waiter.removeWaiterShift(custom_count);
                    custom_count--;
                }
                
            }
        System.out.println("--->Do you want to see current Waiters' Status ?(1/0)");
        int view=scan.nextInt();  
                if(view==1){
                    Waiter.showWaiterShifts();
                   
                }
        custom_count++;
        }while(custom_count<=5);

        
        
    }
    
    public static void main(String a[]){
        
         new Zoho_Hotel_Service();
        
    }
    
    private static void open_Shop(Shop_Factory shop){
        shop.set_Shop(custom_count);
    
    }
    
   
    
  
    

 
}

