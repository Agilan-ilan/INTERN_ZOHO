/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems.Logical_Programs.Sub_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author agilan
 */
public class SubString_text {
    
    public static void SubString(String str1){
        Map<Integer, String> map
            = new HashMap<>();
        
	int ans = 0,temp;
        str1=str1.toLowerCase();
	for (int i = 0; i < str1.length(); i++) 
	{
         for (int j = i+1; j < str1.length(); j++) {
		int k = 0;
		while ((i + k) < str1.length() && (j + k) < str1.length() 
				&& str1.charAt(i + k) == str1.charAt(j + k)) 
		{
			k = k + 1;
		}
                if(k>1){
                    
                
                   System.out.println(j+"df "+str1.substring(i, i+k)+" i "+i+" k"+k);
               
                temp=ans;
                
		ans = Math.max(ans, i+k);
                if(temp != ans ){
                 map.put(i+k,str1.substring(i, i+k));
                    
          
                }
                }
	   }
         System.out.println();
	}
        
      for (Map.Entry<Integer, String
             > me :
             map.entrySet()) {
          System.out.println("Common String"+me.getValue());
      }
  }
    
    public static void main(String args[]){
        SubString("However Everyday is a Day");
    
    }
}
