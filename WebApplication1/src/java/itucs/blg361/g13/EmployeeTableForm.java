/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
        
public class EmployeeTableForm extends Form{
    private List<Employee> selectedEmployee;
    
    public EmployeeTableForm(String id){
        super(id);
        this.selectedEmployee = new LinkedList<Employee>();
        
        CheckGroup empCheck = new CheckGroup("selected_emp",this.selectedEmployee);
        this.add(empCheck);
        
        Application app = (Application) this.getApplication();
        EmpList list = app.getEmpList();
        List<Employee> emplist = list.getList();
        
        PropertyListView listview = new PropertyListView("emp_list",emplist){
        
            @Override
            protected void populateItem(ListItem item){
                Employee emp = (Employee) item.getModelObject();
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("name",emp.getName()));
                item.add(new Label("surname",emp.getSurname()));
                item.add(new Label("depart",emp.getDepartment()));
                item.add(new Label("edu",emp.getEducation()));
                

            }
        };
        empCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
        EmpList list = app.getEmpList();
        for (Employee emp : this.selectedEmployee)
            list.deleteEmployee(emp);
        this.setResponsePage(new EmployeeTable());
            
    }
    
}