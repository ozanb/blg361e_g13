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
import Raw.RawList;
import itucs.blg361.g13.Application;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
        
public class RawTableForm extends Form{
    private List<Raw> selectedRaw;
    
    public RawTableForm(String id){
        super(id);
        this.selectedRaw = new LinkedList<Raw>();
        
        CheckGroup rawCheck = new CheckGroup("selected_raw",this.selectedRaw);
        this.add(rawCheck);
        
        Application app = (Application) this.getApplication();
        RawList list = app.getRawList();
        List<Raw> rawlist = list.getList();
        
        PropertyListView listview = new PropertyListView("raw_list",rawlist){
        
            @Override
            protected void populateItem(ListItem item){
                Raw raw = (Raw) item.getModelObject();
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("name",raw.getName()));
                item.add(new Label("weight",raw.getWeight().toString()));
                item.add(new Label("price",raw.getPrice().toString()));
                item.add(new Label("want",raw.getWant().toString()));
                

            }
        };
        rawCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
        RawList list = app.getRawList();
        for (Raw raw : this.selectedRaw)
            list.deleteRaw(raw);
        this.setResponsePage(new RawTable());
            
    }
    
}
