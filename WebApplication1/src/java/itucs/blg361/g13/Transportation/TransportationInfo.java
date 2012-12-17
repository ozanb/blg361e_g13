/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportation;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class TransportationInfo extends BasePage {

     public TransportationInfo(Transportation transportation) {        
         this.add(new Label("name",transportation.getAgenttosend()));
         this.add(new Label("agenttosend",transportation.getAgenttosend()));
         this.add(new Label("address",transportation.getAddress()));
         this.add(new Label("noforder",transportation.getNoforder().toString()));
         this.add(new Label("expense",transportation.getExpense().toString()));
         this.add(new Label("product",transportation.getProduct()));
        
    }
}
    
    
