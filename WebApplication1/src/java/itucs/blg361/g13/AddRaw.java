/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.pojo.Raw;

/**
 *
 * @author Nadir
 */
public final class AddRaw extends BasePage {

    public AddRaw(Raw aRaw) {
        this.add(new AddRawForm("raw_edit",aRaw));
        

    }
    

}
