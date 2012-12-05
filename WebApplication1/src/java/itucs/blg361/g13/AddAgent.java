/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Agent;

/**
 *
 * @author Razi
 */
public final class AddAgent extends BasePage {

     public AddAgent(Agent aAgent) {
        this.add(new AddAgentForm("add_agent",aAgent));

    }
    
   
}
