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
public class AgentTableLink extends Link{
    
    
      public AgentTableLink(String id){
    super (id);
}
      @Override
public void onClick(){
    
AgentTable target=new AgentTable();
this.setResponsePage(target);
}
      
      
    
    
}
