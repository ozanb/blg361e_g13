/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Nadir
 */

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;

        

public class BasePage extends WebPage{
    
    public BasePage(){
        this(null);
    }
        
    
    
    public BasePage(IModel model){
        super(model);
        this.add(new HeaderPanel("mainNavigation"));
        this.add(new FooterPanel("dateNavigation"));
    }
    
}
