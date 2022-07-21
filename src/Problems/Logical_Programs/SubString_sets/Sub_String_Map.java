/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems.Logical_Programs.SubString_sets;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author agilan
 */
public class Sub_String_Map {
    
  
    
    public static void main(String[] args){
    List<Integer> list = new ArrayList<>();
    
    Map<Integer, List<Integer>> hm
            = new HashMap<Integer,List<Integer> >();
    
    
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
        if(!hm.containsKey(i)){
            hm.put(i, new ArrayList<>());
        }   
        for(int j=i;j<n;j++){
             hm.get(i).add(j);

                    
        }     
       
    }
    int it=-1;
    for (Map.Entry<Integer, List<Integer>
             > me :
             hm.entrySet()) {
        it++;
        
        for(int j=me.getKey();j<=me.getValue().get(me.getValue().size()-1);j++){
            int c1=0,c2=0;
               for(int k=me.getKey();k<=j;k++){

                if(input[k]==1)c1++;
                        else c2++;
            }
       if(c1==c2 && max<j-me.getKey()){
           
                max=j-me.getKey();
                p1=me.getKey();
                p2=j;
            }
            }
        
   
    }



    long end1 = System.nanoTime();
    System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    System.out.println(p1+" "+p2);
    
    
    
    
    
    
    }
    
    
}
