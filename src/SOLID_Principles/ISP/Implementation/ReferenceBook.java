/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.ISP.Implementation;

import SOLID_Principles.ISP.normal.*;
import java.util.Date;

/**
 *
 * @author agilan
 */
public class ReferenceBook implements ILibraryItems  {

    @Override
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    @Override
    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Override
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public void setPages(String Pages) {
        
    }

    @Override
    public void setCheckOutDuration(String CheckOutDuration) {
        this.CheckOutDuration = CheckOutDuration;
    }

    @Override
    public void setBorrower(String Borrower) {
       
    }

    @Override
    public void setBorrowerDate(String BorrowerDate) {
      
    }
    
    String LibraryId;
    String Title;
    String Author;
    String Pages;
    String CheckOutDuration;
    String Borrower;
    String BorrowerDate;

  
    @Override
    public String getLibraryId() {
        return LibraryId;
    }

 
    @Override
    public String getTitle() {
        return Title;
    }


    @Override
    public String getAuthor() {
        return Author;
    }

    @Override
    public String getPages() {
        return Pages;
    }

   
    @Override
    public String getCheckOutDuration() {
        return CheckOutDuration;
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
