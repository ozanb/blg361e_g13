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
import org.apache.wicket.markup.html.link.Link;

public final class RawInfo extends BasePage {
    private Raw raw;

    public RawInfo(Raw aRaw) {
        raw=aRaw;
        this.add(new Label("name",aRaw.getName()));
        this.add(new Label("kind",aRaw.getName()));
        this.add(new Label("weight",aRaw.getWeight().toString()));
        this.add(new Label("price",aRaw.getPrice().toString()));
        this.add(new Label("want",aRaw.getWant().toString()));
    
    }
    

}
