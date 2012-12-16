/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Agent;
import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddAgentForm  extends Form{
     private boolean flag;
     public AddAgentForm(String id, Agent aAgent,boolean flag){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aAgent);
        
        this.setModel(model);   
        this.add(new TextField("name"));
        this.add(new TextField("surname"));
        this.add(new TextField("company"));
        this.add(new TextField("comaddress"));
        this.add(new TextField("comtel"));
        this.add(new TextField("owe"));
        this.flag=flag;
     }
    @Override
    public void onSubmit(){
        Agent agent = (Agent) this.getModelObject();
        Application app = (Application) this.getApplication();
        AgentList list = app.getAgentList();
        if (flag){
            list.addAgent(agent);  
        } else {
            list.update(agent);
        }
        this.setResponsePage(new AgentInfo(agent));
    
    
}
    
}
