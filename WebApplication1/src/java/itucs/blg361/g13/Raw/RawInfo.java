/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;


/**
 *
 * @author Nadir
 */

import itucs.blg361.g13.Raw.Raw;
import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

public final class RawInfo extends BasePage {

    public RawInfo(Raw aRaw) {
        this.add(new Label("name",aRaw.getName()));
    
    }
    

}