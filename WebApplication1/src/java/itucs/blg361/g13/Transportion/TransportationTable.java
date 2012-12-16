/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportion;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Razi
 */
public final class TransportationTable extends BasePage {

    public TransportationTable() {
        
        //super();
           TransportationTableForm form = new TransportationTableForm("transportation_list_form");
           this.add(form);
    }
    
   
}
