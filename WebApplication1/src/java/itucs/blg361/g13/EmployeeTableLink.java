package itucs.blg361.g13;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author Razi
 */
public class EmployeeTableLink extends Link {
   public EmployeeTableLink(String id){
    super (id);
}

@Override
public void onClick(){
    
EmployeeTable target=new EmployeeTable();
this.setResponsePage(target);
}
}