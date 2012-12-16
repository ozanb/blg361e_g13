/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Employee;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class EmpInfo extends BasePage {

    public EmpInfo(Employee emp) {
    add(new Label("Name",emp.getName()));
    add(new Label("Sname",emp.getSurname()));        
    add(new Label("name",emp.getName()));
    add(new Label("surname",emp.getSurname()));
    add(new Label("birthdate",emp.getBirthdate()));
    add(new Label("hiredate",emp.getHiredate()));
    add(new Label("depart",emp.getDepartment()));
    add(new Label("edu",emp.getEducation()));
    add(new Label("salary",emp.getSalary().toString()));
    add(new Label("phonenumber",emp.getPhonenumber()));
    add(new Label("address",emp.getAddress()));
    }
    

}
