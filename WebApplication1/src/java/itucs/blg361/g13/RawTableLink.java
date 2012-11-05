/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Nadir
 */

import org.apache.wicket.markup.html.link.Link;

public class RawTableLink extends Link{
    
    public RawTableLink(String id){
        super(id);
    }

    @Override
    public void onClick() {
        RawTable target = new RawTable();
        this.setResponsePage(target);
    
    }
}
