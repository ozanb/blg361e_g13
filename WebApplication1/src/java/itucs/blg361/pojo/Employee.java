/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.pojo;

/**
 *
 * @author Razi
 */
public class Employee {
    private String name="";
    private String surname="";
    private String birthdate="";
    private String hiredate="";
    private String department="";
    private String education="";
    private Integer salary=0;
    private String phonenumber="";
    private String address="";
    
    
    public Employee(){
        
    }
    
     public Employee(String name_in,String surname_in,String birthdate_in,String hiredate_in, String depart_in,String edu_in,Integer salary_in,String phonenumber_in,String address_in){
        name = name_in;
        surname = surname_in;
        birthdate=birthdate_in;
        hiredate=hiredate_in;           
        department = depart_in;
        education = edu_in;
        salary=salary_in;
        phonenumber=phonenumber_in;
        address=address_in;
        
    }
     public void setName(String name_in){
        name = name_in;
    }
     public void setSurname(String surname_in){
        surname = surname_in;
    }
          public void setBirthdate(String birthdate_in){
        birthdate=birthdate_in;
    }
     public void setHiredate(String hiredate_in ){
        hiredate=hiredate_in; 
    }
     public void setDepartment(String depart_in){
        department = depart_in;
    }
     public void setEducation(String edu_in){
        education = edu_in;
    }
         public void setSalary(Integer salary_in){
        salary = salary_in;
    }
    
    public void editSalary(Integer salary_in){
        salary = salary + salary_in;
    }
    
    public void emptySalary(){
        salary = 0;
    }
     
        
          public void setPhonenumber(String phonenumber_in){
        phonenumber=phonenumber_in;
       
    }
     public void setAddress(String address_in){
        address=address_in;
    }
     
     
     
     
     
     
     
     public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
         public String getBirthdate(){
        return birthdate;
    }
    public String getHiredate(){
        return hiredate;
    }
    public String getDepartment(){
        return department;
    }
    public String getEducation(){
        return education;
    }
    
         public Integer getSalary(){
        return salary;
    }
    
        public String getPhonenumber(){
        return phonenumber;
    }
    public String getAddress(){
        return address;
    }
    
    
    
                   
    
    
}