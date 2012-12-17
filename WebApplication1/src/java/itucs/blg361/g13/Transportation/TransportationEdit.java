/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportation;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class TransportationEdit extends BasePage {

    public TransportationEdit(Transportation transportation) {
        this.add(new AddTransportationForm("trans_edit",transportation,false));
    }
    
}
