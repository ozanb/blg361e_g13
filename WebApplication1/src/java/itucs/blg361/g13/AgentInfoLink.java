/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;
import org.apache.wicket.markup.html.link.Link;
/**
 *
 * @author Razi
 */
public class AgentInfoLink  extends Link{
      private Agent agent;
    public AgentInfoLink(String id, Agent aAgent){
        super(id);
        this.agent= aAgent;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new AgentInfo(this.agent));
    }
}
