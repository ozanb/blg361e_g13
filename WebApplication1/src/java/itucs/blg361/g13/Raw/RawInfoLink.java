/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

import itucs.blg361.g13.Raw.Raw;
import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author Nadir
 */
public class RawInfoLink extends Link{
    private Raw raw;
    public RawInfoLink(String id, Raw aRaw){
        super(id);
        this.raw= aRaw;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new RawInfo(this.raw));
    }
    
}
