/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Agent;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Razi
 */
public final class AddAgent extends BasePage {

     public AddAgent(Agent aAgent) {
        this.add(new AddAgentForm("add_agent",aAgent,true));

    }
    
   
}
