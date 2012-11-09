/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import java.util.Date;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class EmployeeTable extends BasePage {
public EmployeeTable(){
    EmployeeTableForm form = new EmployeeTableForm("emp_list_form");
    this.add(form);
      Date now = new Date();
        Label labeldatetime= new Label("datetime",now.toString());
        add(labeldatetime);
    
    
}
}
