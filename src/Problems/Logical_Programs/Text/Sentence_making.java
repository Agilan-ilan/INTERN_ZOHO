/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems.Logical_Programs.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author agilan
 */
public class Sentence_making {
    
    static int L=30;
     static ArrayList<String> Finallist=new ArrayList<>();
     static ArrayList<String> LastLine=new ArrayList<>();
     static String Final="[\n";
     static int Firstline;
  
     static int LastList;
    
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
             LastLine=list.getValue();
        }
        for (Map.Entry<Integer, ArrayList<String>> list :
             listString.entrySet()) {
            int wordcount=list.getValue().size();

            int length=0;
            for(int i=0;i<wordcount;i++){
                length+=list.getValue().get(i).length();
               
            }
            int freespace=L-length;
          
            concatinator(list.getValue(),freespace,wordcount);
          
        } 
        Final+="\n]";
    }
    
    
    static void concatinator(ArrayList<String> list,int freespace,int wordcount){
        
        if(LastLine.get(0).equals(list.get(0)))
        {
            append(list,freespace,wordcount);
        }
        else 
        {
            appendLeft(list,freespace,wordcount);
        }
    }
    
    
    static void append(ArrayList<String> list,int freespace,int wordcount){
        
        String temp="";
        int netspace=freespace-wordcount+1;
        
        
        for(int i=0;i<wordcount;i++){
            temp+=list.get(i);
            if(i!=wordcount-1){ 
                    if(netspace>0){
                       
                      
                    
                   
                    temp+=" ";
                
                    }
                temp+=" ";
                }
        }
           
          Final+=",\n"+temp;   
         
        
    
    }
    
    
    static String appendRight(String list,int freespace,int key){
        
        for(int i=0;i<freespace;i++){
            list+=" ";
        }if(key==1){
           
             if(Firstline==0){
              Final+=list;
              Firstline++;
          }else
          Final+=",\n"+list;
        }
        return list;
    }
    
    static void appendLeft(ArrayList<String> list,int freespace,int wordcount){
        String temp="";
        int netspace=freespace-wordcount+1;
        int imbalance=(netspace%(wordcount-1));
        for(int i=0;i<wordcount;i++){ System.out.println(freespace+" n: "+netspace+" w :"+wordcount);
                temp+=list.get(i);
                if(i==0){
                    temp=appendRight(temp,imbalance,0);
 
                   
                }
                if(i!=wordcount-1){ 
                    if(netspace>0){
                       
                      
                        for(int j=0;j<(netspace/(wordcount-1));j++){
                   
                    temp+=" ";
                }
                    }
                temp+=" ";
                }
                
              
               
            } System.out.println("\n"); 
          if(Firstline==0){
              Final+=temp;
              Firstline++;
          }else
          Final+=",\n"+temp;

       
    }
      
    public static void main(String args[]){
        
        
         String[] input1=new String[]{"To","access","the","data","To","access","the","data","members","of","parent","class","when","both","parent","To","access","the","data","members","of","parent","class","when","both","parent","and","child","class","have","member","with","same","name"};

//         String[] input1=new String[]{"This", "is", "an", "example", "of", "text", "justification."};
//         String[] input1=new String[]{"There","are","many","baloons","in","this","world."};
         Make_Sentence(input1);
         
         
         
         System.out.println(Final);
         
         
    }
    
    
    

}
