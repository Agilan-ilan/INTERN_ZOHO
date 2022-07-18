
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

/**
 *
 * @author agilan
 */

// Java program to Extract Digits from A Given Integer

// Importing Libraries
import java.util.*;


class Stepping_Number {

    private static int static_first_number;
    private static int number;
    
    //Gets the length of the number
    static int get_length(int number){
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }
    
    //Gets the digit of the number one by one from the last
        static int get_number(){
            // Finding the remainder (Last Digit)
            int remainder = number % 10;

            // Removing the last digit/current last digit
            number = number / 10;
            
            return remainder;
        }
        
        //Finds the difference between the last parametized value and the one which is sent for now
        static boolean find_difference(int number){
            
           int first_number=static_first_number;
           static_first_number=number;
           
           if(Math.abs(first_number-number)==1)
               return true;
           
               return false;
                      
          
        }
	
        //Finds whether the number passed as an aurgument is Stepping function or not
        static boolean find_stepping_number(int number){
            
            int a,track_number=0;
            boolean output=true;
            int first_number=0,length;
            
         length=get_length(number);
                
                     while (number > 10){
                         
                         //For the first digit {Just save the number}
                         if(track_number==0){
                             first_number=get_number();
                             System.out.println(length+"firt:"+first_number);

                             static_first_number=first_number;
                             
                         }
                         
                         
                         //Between first and last{Find Diff Btw consequtive numbers}
                         else{
                             int compare_number=get_number();
                             
                             output=find_difference(compare_number);
                             if(output==false)return false;
                             
                             //For the last digit {Find Diff Btw first and last}
                             if(track_number==length-1){
                                int last_number=compare_number;
                                
                                static_first_number=first_number;
                                output=find_difference(last_number);
                                return output;
                         }
                         }
                        track_number++;
                        
                        
                                 
                    }
                     return true;
        }
	public static void main(String[] args)
	{
            boolean Stepper_Number=false;
            int value_passed_key=0;
            
                Scanner scan=new Scanner(System.in);
                int current_number,ending_number;
		// Input the number range
		System.out.println("Enter the Starting Index of the Range");
                current_number=scan.nextInt();
                
                System.out.println("Enter the Ending Index of the Range");
                ending_number=scan.nextInt();
                
                
                
                for(int i=current_number;i<=ending_number;i++){
                    number=i;
                
                    Stepper_Number=find_stepping_number(number);
                    if(Stepper_Number==true){
                        System.out.println("The Number "+i+" is a stepper number");
                        value_passed_key=1;
                    }
                    if(value_passed_key==1){
                        System.out.println("No stepping numbers");
                    }
                }
                
                     
                    
		
		
	}
}


