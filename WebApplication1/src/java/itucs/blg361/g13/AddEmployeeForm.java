/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */

import itucs.blg361.entityBean.Employee;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class AddEmployeeForm extends Form{
    
    public AddEmployeeForm(String id, Employee aEmp){
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
       
        
    }
    @Override
    public void onSubmit(){
        Employee emp = (Employee) this.getModelObject();
        Application app = (Application) this.getApplication();
        EmpList list = app.getEmpList();
        list.addEmployee(emp);
        this.setResponsePage(new EmpInfo(emp));
        
    }
    
}
