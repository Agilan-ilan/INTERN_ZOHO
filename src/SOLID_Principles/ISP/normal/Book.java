/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.ISP.normal;

/**
 *
 * @author agilan
 */
public class Book implements IBorowableBook{
    
    
    String LibraryId;
    String Title;
    String Author;
    String Pages;
    String CheckOutDuration;
    String Borrower;
    String BorrowerDate;
    

    @Override
    public String getAuthor() {
      return Author;
    }

    @Override
    public String getBorrower() {
       return Borrower;
    }

    @Override
    public String getBorrowerDate() {
        return BorrowerDate;
    }

    @Override
    public String getCheckOutDuration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public String getPages() {
        return Pages;
    }

    

    @Override
    public void CheckIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CheckOut(String borrower) {
        Borrower=borrower;
    }

    @Override
    public void GetDueDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
