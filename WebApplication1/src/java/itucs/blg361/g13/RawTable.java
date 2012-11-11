/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;


import java.util.Date;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;


/**
 *
 * @author Nadir
 */
public final class RawTable extends BasePage {

    public RawTable() {
        RawTableForm form = new RawTableForm("raw_list_form");
        this.add(form);

        

    }
    
}
