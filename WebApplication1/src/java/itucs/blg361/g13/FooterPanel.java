/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import java.util.Date;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author Nadir
 */
public final class FooterPanel extends Panel {

    public FooterPanel(String id) {
        super(id);
        
        Date now = new Date();
        Label labeldatetime= new Label("datetime",now.toString());
        this.add(labeldatetime);
    }
}
