/*
 * To change this ttransportationlate, choose Tools | Ttransportationlates
 * and open the ttransportationlate in the editor.
 */
package itucs.blg361.g13.Transportation;
import itucs.blg361.g13.Agent.AgentList;
import itucs.blg361.g13.Application;
import itucs.blg361.g13.Product.ProductList;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddTransportationForm  extends Form{
    private boolean flag;
    private List<String> agentlist=new LinkedList<String>();
    private List<String> prodlist=new LinkedList<String>();
    public AddTransportationForm(String id, Transportation aTransportation, boolean flag){
        super(id);
        AgentList alist= new AgentList();
        agentlist=alist.getNames();
        DropDownChoice<String> slist1 = new DropDownChoice<String>("agenttosend",agentlist);
        this.add(slist1);
        
        ProductList plist= new ProductList();
        prodlist=plist.getNames();
        DropDownChoice<String> slist2 = new DropDownChoice<String>("product",prodlist);
        this.add(slist2);
        
        CompoundPropertyModel model = new CompoundPropertyModel(aTransportation);
        this.setModel(model);   
        
        this.add(new TextField("address"));
        this.add(new TextField("noforder"));
        this.add(new TextField("expense"));        
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
