/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Agent;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Razi
 */
public final class AgentTable extends BasePage {

    public AgentTable() {
        
        //super();
           AgentTableForm form = new AgentTableForm("agent_list_form");
           this.add(form);
    }
    
   
}
