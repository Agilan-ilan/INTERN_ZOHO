/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID_Principles.ISP.normal;

import java.util.Date;

/**
 *
 * @author agilan
 */
public class ReferenceBook implements IBook  {

    

    
    
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
    public String getPages() {
        return Pages;
    }

   
  

   
  
    
}
