/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
public class Employee {
    private String name="";
    private String surname="";
    private String department="";
    private String education="";
    
    public Employee(){
        
    }
    
     public Employee(String name_in,String surname_in, String depart_in,String edu_in){
        name = name_in;
        surname = surname_in;
        department = depart_in;
        education = edu_in;
    }
     public void setName(String name_in){
        name = name_in;
    }
     public void setSurname(String surname_in){
        surname = surname_in;
    }
     public void setDepartment(String depart_in){
        department = depart_in;
    }
     public void setEducation(String edu_in){
        education = edu_in;
    }
     
     public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getDepartment(){
        return department;
    }
    public String getEducation(){
        return education;
    }
    
    
    
                   
    
    
}
