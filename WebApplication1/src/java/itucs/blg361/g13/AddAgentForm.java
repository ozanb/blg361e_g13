/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Agent;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddAgentForm  extends Form{
    
     public AddAgentForm(String id, Agent aAgent){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aAgent);
        
        this.setModel(model);   
        this.add(new TextField("name"));
        this.add(new TextField("surname"));
        this.add(new TextField("company"));
        this.add(new TextField("comaddress"));
        this.add(new TextField("comtel"));
        this.add(new TextField("owe"));
        
     }
    @Override
    public void onSubmit(){
        Agent agent = (Agent) this.getModelObject();
        Application app = (Application) this.getApplication();
        AgentList list = app.getAgentList();
        list.addAgent(agent);
        this.setResponsePage(new AgentInfo(agent));
    
    
}
    
}
