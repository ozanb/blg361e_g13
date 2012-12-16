/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Employee;

import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author Razi
 */
public class EmpInfoLink extends Link{
    private Employee emp;
    public EmpInfoLink(String id, Employee aEmp){
        super(id);
        this.emp= aEmp;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new EmpInfo(this.emp));
    }
    
}
