/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author Nadir
 */

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public final class HeaderPanel extends Panel {

    public HeaderPanel(String id) {
        super(id);
        Link homeLink = new Link("home"){

            @Override
            public void onClick() {
                this.setResponsePage(HomePage.class);
            }  
        };
        this.add(homeLink);
        
        Link rawTableLink = new Link("rawtable"){

            @Override
            public void onClick() {
                this.setResponsePage(new RawTable());
            }  
        };
        this.add(rawTableLink);
        
        Link rawEdit = new Link("rawedit"){
            
            @Override
            public void onClick(){
                Raw raw = new Raw();
                this.setResponsePage(new RawEdit(raw));
            }
        };
        this.add(rawEdit);
 
    }
}
