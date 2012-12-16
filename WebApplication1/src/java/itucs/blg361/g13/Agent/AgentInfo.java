/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Agent;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class AgentInfo extends BasePage {

     public AgentInfo(Agent agent) {
        
         this.add(new Label("company",agent.getCompany()));
        
    }
    
    
    }
    
    
