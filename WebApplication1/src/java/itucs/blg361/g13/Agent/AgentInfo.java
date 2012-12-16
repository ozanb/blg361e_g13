/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Agent;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;

/**
 *
 * @author Razi
 */
public final class AgentInfo extends BasePage {

     public AgentInfo(Agent agent) {
         this.add(new Label("Name",agent.getName()));
         this.add(new Label("name",agent.getName()));
         this.add(new Label("surname",agent.getSurname()));
         this.add(new Label("company",agent.getCompany()));
         this.add(new Label("comaddress",agent.getComaddress()));
         this.add(new Label("comtel",agent.getComtel()));
         this.add(new Label("owe",agent.getOwe().toString()));
        
    }
    
    
    }
    
    
