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
public interface ILibraryItems {

    void CheckIn();

    void CheckOut(String borrower);

    void GetDueDate();

    String getAuthor();

    String getBorrower();

    String getBorrowerDate();

    String getCheckOutDuration();

    String getLibraryId();

    String getPages();

    String getTitle();

    void setAuthor(String Author);

    void setBorrower(String Borrower);

    void setBorrowerDate(String BorrowerDate);

    void setCheckOutDuration(String CheckOutDuration);

    void setLibraryId(String LibraryId);

    void setPages(String Pages);

    void setTitle(String Title);
    
}
