/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author ozan
 */
public class HRDepartment {
    
    private int id;
    private String name;
    private String surName;
    private String email;
    private String mobilePhone;
    private String address;
    private String position;
    private String experience;
    
    public HRDepartment(){
    
    }
    
    public HRDepartment(int id, String name, String surName, String email, String mobilePhone,
            String address, String position, String experience){
    
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.address = address;
        this.position = position;
        this.experience = experience;
        
    }
}
