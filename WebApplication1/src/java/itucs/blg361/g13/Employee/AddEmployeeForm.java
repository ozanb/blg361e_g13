/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Employee;

/**
 *
 * @author Razi
 */

import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class AddEmployeeForm extends Form{
    private boolean flag;
    public AddEmployeeForm(String id, Employee aEmp, boolean flag){
        super(id);
        
        CompoundPropertyModel model = new CompoundPropertyModel(aEmp);
        this.setModel(model);
        
        this.add(new TextField("name"));
        this.add(new TextField("surname"));
        this.add(new TextField("birthdate"));
        this.add(new TextField("hiredate"));
        this.add(new TextField("department"));
        this.add(new TextField("education"));     
        this.add(new TextField("salary"));
        this.add(new TextField("phonenumber"));  
        this.add(new TextField("address"));
        this.flag=flag;
    }
    @Override
    public void onSubmit(){
        Employee emp = (Employee) this.getModelObject();
        Application app = (Application) this.getApplication();
        EmpList list = app.getEmpList();
        if (flag) {
            list.addEmployee(emp);
        } else {
            list.update(emp);
        }
        this.setResponsePage(new EmpInfo(emp));
        
    }
    
}
