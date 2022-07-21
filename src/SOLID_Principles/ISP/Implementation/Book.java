/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.ISP.Implementation;

import SOLID_Principles.ISP.normal.*;

/**
 *
 * @author agilan
 */
public class Book implements ILibraryItems {
    
    
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
    public String getLibraryId() {
        return LibraryId;
    }

    @Override
    public String getPages() {
        return Pages;
    }

    @Override
    public String getTitle() {
       return Title;
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

    @Override
    public void setAuthor(String Author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBorrower(String Borrower) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBorrowerDate(String BorrowerDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCheckOutDuration(String CheckOutDuration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLibraryId(String LibraryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPages(String Pages) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTitle(String Title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
