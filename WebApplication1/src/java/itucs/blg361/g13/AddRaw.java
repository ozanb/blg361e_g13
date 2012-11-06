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
public final class AddRaw extends BasePage {

    public AddRaw(Raw aRaw) {
        this.add(new AddRawForm("raw_edit",aRaw));
        
        Date now = new Date();
        Label labeldatetime= new Label("datetime",now.toString());
        add(labeldatetime);
    }
    

}
