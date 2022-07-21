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
public interface IBook extends ILibraryItems{
    
        String getAuthor();
        String getPages();
}
