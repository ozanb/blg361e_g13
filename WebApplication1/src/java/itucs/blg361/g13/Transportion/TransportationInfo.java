/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportion;

import itucs.blg361.g13.Transportion.Transportation;
import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class TransportationInfo extends BasePage {

     public TransportationInfo(Transportation transportation) {
        
         this.add(new Label("company",transportation.getCompany()));
        
    }
    
    
    }
    
    
