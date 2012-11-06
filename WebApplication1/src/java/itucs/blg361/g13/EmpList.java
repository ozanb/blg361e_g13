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

public class EmpList {
    private List<Employee> empList;
    
    public EmpList(){
        empList = new LinkedList<Employee>();       
    }
    
    public List<Employee> getList(){
        return empList;
    }
    
    public void addEmployee(Employee emp){
        empList.add(emp);
    }
    
    public void deleteEmployee(Employee emp){
        empList.remove(emp);
    }
}
