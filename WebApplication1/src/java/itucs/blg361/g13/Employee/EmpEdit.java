/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Employee;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class EmpEdit extends BasePage {

    public EmpEdit(Employee emp) {
        this.add(new AddEmployeeForm("emp_edit",emp,false));
    }

}
