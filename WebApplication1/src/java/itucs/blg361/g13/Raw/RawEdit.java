/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class RawEdit extends BasePage {

    public RawEdit(Raw aRaw) {
        this.add(new AddRawForm("raw_edit",aRaw,false));
        
    }
    

}
