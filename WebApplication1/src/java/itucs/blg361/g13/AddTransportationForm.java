/*
 * To change this ttransportationlate, choose Tools | Ttransportationlates
 * and open the ttransportationlate in the editor.
 */
package itucs.blg361.g13;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddTransportationForm  extends Form{
    
     public AddTransportationForm(String id, Transportation aTransportation){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aTransportation);
        
        this.setModel(model);   
          this.add(new TextField("company"));
        this.add(new TextField("country"));
        this.add(new TextField("city"));
      

        
     }
    @Override
    public void onSubmit(){
        Transportation transportation = (Transportation) this.getModelObject();
        Application app = (Application) this.getApplication();
        TransportationList list = app.getTransportationList();
        list.addTransportation(transportation);
        this.setResponsePage(new TransportationInfo(transportation));
    
    
}
    
}
