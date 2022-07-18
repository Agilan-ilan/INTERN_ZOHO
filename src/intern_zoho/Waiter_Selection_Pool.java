/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intern_zoho;



import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author agilan
 */
public class Waiter_Selection_Pool {
    
    
   
    
    private final static Waiter_Selection_Pool _instance = new Waiter_Selection_Pool();
    private int _nextWaiterCount=0;
    
    public ArrayList<Waiter> _waiters=new ArrayList<>();
    {
            {
                _waiters.add(new Waiter("Arun",0,0,false));
                _waiters.add(new Waiter("Varun",0,0,false));
                _waiters.add(new Waiter("Karan",0,0,false));
            }
    };
    
    
    
    public static Waiter_Selection_Pool getTableServers(){
        return _instance;
    }
    
    public void getNextWaiter(int custom_count,int shift){
        String _nextWaiter;
        for(int i=0;i<_waiters.size();i++){

        _nextWaiter=_waiters.get(_nextWaiterCount)._name;
        if(_waiters.get(_nextWaiterCount)._work==false){
            
             _waiters.get(_nextWaiterCount)._shift=shift;
            _waiters.get(_nextWaiterCount)._work=true;
            _waiters.get(_nextWaiterCount)._customer=custom_count;
                  
            System.out.println(_nextWaiter+" has shifted his work to shop "+shift);
            
           _nextWaiterCount++;
        
            if(_nextWaiterCount>=_waiters.size()){
                _nextWaiterCount=0;
            }
            return;
            
        }
            _nextWaiterCount++;
        
            if(_nextWaiterCount>=_waiters.size()){
                _nextWaiterCount=0;
            }
        }
        System.out.println("Please wait , our workers will reach you soon");
    }
    
    public void removeWaiterShift(int customer){
        for(int i=0;i<_waiters.size();i++){
            if(_waiters.get(i)._customer==customer){
                _waiters.get(i)._customer=0;
                _waiters.get(i)._shift=0;
                _waiters.get(i)._work=false;
                break;
            }
        }
    }
    
    public void showWaiterShifts(){
         for(int i=0;i<_waiters.size();i++){
             System.out.println("----------------------------------------------------------");
             System.out.println("\n("+i+")\nName:\t"+_waiters.get(i)._name +"\nShift:\t"+_waiters.get(i)._shift+"\nCustomer:\t"+_waiters.get(i)._customer+"\nWork:\t"+_waiters.get(i)._work);
             System.out.println("----------------------------------------------------------");

         }
        
    }
}

