/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class EmpInfo extends BasePage {

    public EmpInfo(Employee emp) {
        
         this.add(new Label("name",emp.getName()));
        
    }
    

}