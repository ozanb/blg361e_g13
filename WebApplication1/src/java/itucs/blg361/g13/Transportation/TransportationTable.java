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
        
        TransportationList TC = new TransportationList();
        List<Transportation> TCList = TC.getList();
        ListView view = new PropertyListView("transportation_list_form", TCList) {

            @Override
            protected void populateItem(ListItem item) {
//                item.add(new Label("agent"));
                item.add(new Label("address"));
//                item.add(new Label("product"));
                item.add(new Label("nOfOrder"));
                item.add(new Label("expense"));              
            }
        };
        this.add(view);
        
        
        
        
//           TransportationTableForm form = new TransportationTableForm("transportation_list_form");
//           this.add(form);
    }
    
   
}
