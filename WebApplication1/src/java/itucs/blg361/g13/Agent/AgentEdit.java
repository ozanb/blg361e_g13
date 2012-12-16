/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Agent;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class AgentEdit extends BasePage {

    public AgentEdit(Agent agent) {
        this.add(new AddAgentForm("agent_edit",agent,false));
    }
    

}
