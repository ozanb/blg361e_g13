/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
import itucs.blg361.entityBean.Agent;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;



public class AgentTableForm extends Form {
     private List<Agent> selectedAgent;
    
    public AgentTableForm(String id){
        super(id);
        this.selectedAgent = new LinkedList<Agent>();
        
        CheckGroup agentCheck = new CheckGroup("selected_agent",this.selectedAgent);
        this.add(agentCheck);
        
        Application app = (Application) this.getApplication();
       AgentList list = app.getAgentList();
        List<Agent> agentlist = list.getList();
        
        PropertyListView listview = new PropertyListView("agent_list",agentlist){
        
            @Override
            protected void populateItem(ListItem item){
                Agent agent = (Agent) item.getModelObject();
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("name",agent.getName()));
                item.add(new Label("surname",agent.getSurname()));
                 item.add(new Label("company",agent.getCompany()));
                item.add(new Label("comaddress",agent.getComaddress()));
                 item.add(new Label("comtel",agent.getComtel()));
                item.add(new Label("owe",agent.getOwe().toString()));
            }
        };
        agentCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
       AgentList list = app.getAgentList();
        for (Agent agent : this.selectedAgent)
            list.deleteAgent(agent);
        this.setResponsePage(new AgentTable());
            
    }
    
    
    
    
    
    
    
    
    
    
    
}
