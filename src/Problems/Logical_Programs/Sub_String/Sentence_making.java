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
public class Sentence_making {
    
    static int L=16;
     static ArrayList<String> Finallist=new ArrayList<>();
    
    static void Make_Sentence(String[] input){
        Map<Integer, ArrayList<String>> listString = new HashMap ();
        listString=predictor(input);
        justifier(listString);
        
    }
    
    
    //With the length of the words as input ,it predicts the number of words required to fill a sentance
    static Map<Integer, ArrayList<String>> predictor(String[] input){
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer, ArrayList<String>> listString = new HashMap ();
        
        for(int i=0;i<input.length;i++){
            list.add(input[i].length());
            
        }
        int count=0,index=0;
        listString.put(index, new ArrayList());
        for(int i=0,wordcount=0;i<input.length;i++,wordcount++){
            
            if(count+list.get(i)>L-wordcount){
                 index++;
                listString.put(index, new ArrayList());
                wordcount=0;count=0;
            }
                count+=list.get(i);
                listString.get(index).add(input[i]);
              
            
            
            }
           
            
             return listString;
            
        }
        
        
        
    
    
    
    //requires a words for a line as input and converts it into a justified line
    static void justifier(Map<Integer, ArrayList<String>> listString){
        for (Map.Entry<Integer, ArrayList<String>> list :
             listString.entrySet()) {
            
            
            int length=0;int wordcount=list.getValue().size();
            for(int i=0;i<wordcount;i++){
                length+=list.getValue().get(i).length();
            }
            int freespace=L-length;
            concatinator(list.getValue(),freespace,wordcount);
         
        }
    }
    
    
    static void concatinator(ArrayList<String> list,int freespace,int wordcount){
        
        if(wordcount==1){
            appendRight(list.get(0),freespace,1);
        }
        else {
            appendLeft(list,freespace,wordcount);
        }
    }
    static String appendRight(String list,int freespace,int key){
        
        for(int i=0;i<freespace;i++){
            list+="+";
        }if(key==1) Finallist.add(list);
        return list;
    }
    
    static void appendLeft(ArrayList<String> list,int freespace,int wordcount){
        String temp="";int netspace=freespace-wordcount-1;
        int imbalance=(freespace%wordcount);
        for(int i=0;i<wordcount;i++){
                temp+=list.get(i);
                if(i==0){
                    temp=appendRight(temp,imbalance!=0?imbalance:1,0);
 
                   
                }
                if(i!=wordcount-1){
                    if(netspace>0){
                        for(int j=0;j<(freespace/netspace);j++){
                   
                    temp+="/";
                }
                    }
                temp+=">";
                }
                
              
             //   System.out.println(temp); 
            }
          Finallist.add(temp);
       
    }
    
    
    
    public static void main(String args[]){
        
         String[] input1=new String[]{"This", "is", "an", "example", "of", "text", "justification."};
         String[] input2=new String[]{"There","are","many","baloons","in","this","world."};
         Make_Sentence(input1);
         
         
         System.out.println("\n\n+ indicates filling not evenly divided space");
         System.out.println("> indicates normal spaceing between words4");
         System.out.println("/ indicates filling space for justifying around left and right\n\n");
         System.out.println(Finallist);
         Finallist.clear();
         Make_Sentence(input2);
         System.out.println(Finallist);
    }
    
    
    

}
