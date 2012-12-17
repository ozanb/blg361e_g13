/*
 * To change this ttransportationlate, choose Tools | Ttransportationlates
 * and open the ttransportationlate in the editor.
 */
package itucs.blg361.g13.Transportation;
import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddTransportationForm  extends Form{
     private boolean flag;
     public AddTransportationForm(String id, Transportation aTransportation, boolean flag){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aTransportation);
        
        this.setModel(model);   
          this.add(new TextField("agenttosend"));
        this.add(new TextField("address"));
        this.add(new TextField("noforder"));
        this.add(new TextField("expense"));
        this.add(new TextField("product"));
        this.flag=flag;
        
     }
    @Override
    public void onSubmit(){
        Transportation transportation = (Transportation) this.getModelObject();
        Application app = (Application) this.getApplication();
        TransportationList list = app.getTransportationList();
        if (flag) {
            list.addTransportation(transportation);
        } else {
            list.update(transportation);
        }
        this.setResponsePage(new TransportationInfo(transportation));
    
    
}
    
}
