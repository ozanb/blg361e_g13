/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportation;

import itucs.blg361.g13.BasePage;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.list.PropertyListView;

/**
 *
 * @author Razi
 */
public final class TransportationTable extends BasePage {

    public TransportationTable() {
        super();
     
        
        
          TransportationTableForm form = new TransportationTableForm("transportation_list_form");
         this.add(form);
    }
    
   
}
