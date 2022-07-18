/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intern_zoho;

/**
 *
 * @author agilan
 */
public class Waiter {
   String _name;
   int _shift;
   int _customer;
   boolean _work;
   public Waiter(String name,int customer, int shift,boolean work) {
      this._name = name;
      this._customer = customer;
      this._shift = shift;
      this._work=work;
   }
}
