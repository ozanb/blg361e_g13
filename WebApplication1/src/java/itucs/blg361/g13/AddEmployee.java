/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.pojo.Employee;


/**
 *
 * @author Razi
 */
public final class AddEmployee extends BasePage {

    public AddEmployee(Employee aEmployee) {
        this.add(new AddEmployeeForm("add_emp",aEmployee));


    }
    

}
