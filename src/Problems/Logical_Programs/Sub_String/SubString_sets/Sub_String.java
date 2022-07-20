/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems.Logical_Programs.Sub_String.SubString_sets;

import java.util.Scanner;

/**
 *
 * @author agilan
 */
public class Sub_String {
    
  
    
    public static void main(String[] args){
        
          
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of the input");
    int n=scan.nextInt();
    
    int[] input=new int[n];
    System.out.println("Enter the input array");
    
    for(int i=0;i<n;i++){
        input[i]=scan.nextInt();
        
    }
    long start1 = System.nanoTime();
    int max=-1,p1=-1,p2=-1;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int c1=0,c2=0;
            for(int k=i;k<=j;k++){
               // System.out.println(input[k]+"kk"+j);
                if(input[k]==1)c1++;
                        else c2++;
            }
            if(c1==c2 && max<j-i){
                max=j-i;
                p1=i;
                p2=j;
            }
           // System.out.println(" ");
        }
    }
    long end1 = System.nanoTime();
    System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    
    if(p1==-1 && p2==-1){
        System.out.println("No sub-array found.");
    }else
    System.out.println(p1+"to"+p2);
    
    
    
    
    
    
    }
    
    
}
