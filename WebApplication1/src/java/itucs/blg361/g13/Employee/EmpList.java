/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Employee;

/**
 *
 * @author Razi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class EmpList {
    private Connection conn = null;
    
    public EmpList(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/milkyweb","root", "root");
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        
    }
    
    public List<Employee> getList(){
        List<Employee> list = new LinkedList<Employee>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String birthdate = rs.getString("birthdate");
                String hiredate = rs.getString("hiredate");
                String department = rs.getString("department");
                String education = rs.getString("education");
                Integer salary = rs.getInt("salary");
                String phonenumber = rs.getString("phonenumber");
                String address = rs.getString("address");
                Employee emp = new Employee(id,name,surname,birthdate,hiredate,department,education,salary,phonenumber,address);
                list.add(emp);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addEmployee(Employee emp){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Employee(NAME, SURNAME,BIRTHDATE ,HIREDATE,DEPARTMENT,EDUCATION,SALARY,PHONENUMBER,ADDRESS)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getSurname());
            stmt.setString(3, emp.getBirthdate());
            stmt.setString(4, emp.getHiredate());
            stmt.setString(5, emp.getDepartment());
            stmt.setString(6, emp.getEducation());
            stmt.setInt(7, emp.getSalary());
            stmt.setString(8, emp.getPhonenumber());
            stmt.setString(9, emp.getAddress());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteEmployee(Employee emp){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM employee WHERE (ID=?)");
            stmt.setInt(1, emp.getId());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
}
