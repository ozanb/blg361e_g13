
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
import itucs.blg361.entityBean.Transportation;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;



public class TransportationTableForm extends Form {
     private List<Transportation> selectedTransportation;
    
    public TransportationTableForm(String id){
        super(id);
        this.selectedTransportation = new LinkedList<Transportation>();
        
        CheckGroup transportationCheck = new CheckGroup("selected_transportation",this.selectedTransportation);
        this.add(transportationCheck);
        
        Application app = (Application) this.getApplication();
       TransportationList list = app.getTransportationList();
        List<Transportation> transportationlist = list.getList();
        
        PropertyListView listview = new PropertyListView("transportation_list",transportationlist){
        
            @Override
            protected void populateItem(ListItem item){
                Transportation transportation = (Transportation) item.getModelObject();
                item.add(new Check("selected", item.getModel()));
                  item.add(new Label("company",transportation.getCompany()));
                  item.add(new Label("country",transportation.getCountry()));
                  item.add(new Label("city",transportation.getCity()));

            }
        };
        transportationCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
       TransportationList list = app.getTransportationList();
        for (Transportation transportation : this.selectedTransportation)
            list.deleteTransportation(transportation);
        this.setResponsePage(new TransportationTable());
            
    }
    
    
    
    
    
    
    
    
    
    
    
}
