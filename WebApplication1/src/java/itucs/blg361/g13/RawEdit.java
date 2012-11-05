/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import java.util.Date;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Nadir
 */
public final class RawEdit extends BasePage {

    public RawEdit(Raw aRaw) {
        this.add(new RawEditForm("raw_edit",aRaw));
        
        Date now = new Date();
        Label labeldatetime= new Label("datetime",now.toString());
        add(labeldatetime);
    }
    

}
