
package itucs.blg361.g13.Transportation;

/**
 *
 * @author Razi
 */
import itucs.blg361.g13.Application;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
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
                final Transportation transportation = (Transportation) item.getModelObject();
                item.add(new Link("editlink")
                {
                    @Override
                    public void onClick()
                    {
                        setResponsePage(new TransportationEdit(transportation));
                    }
                });
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("agenttosend",transportation.getAgenttosend()));
                item.add(new Label("address",transportation.getAddress()));
                item.add(new Label("noforder",transportation.getNoforder().toString()));
                item.add(new Label("expense",transportation.getExpense().toString()));
                item.add(new Label("product",transportation.getProduct()));
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
