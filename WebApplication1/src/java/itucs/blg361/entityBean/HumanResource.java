/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

import java.io.Serializable;

/**
 *
 * @author ozan
 */
public class HumanResource implements Serializable {
    
    private int id;
    private String tcnumber;
    private String name;
    private String surname;
    private String birthDate;
    private String email;
    private String mobilePhone;
    private String address;
    private String position;
    private String experience;
    private String gender;
    
    
    public HumanResource(){
            
    }
    
    public HumanResource (int id, String tcnumber, String name, String surname, String birthDate, String email,
            String mobilePhone, String address, String position, String experience, String gender){
        
        this.id = id;
        this.tcnumber = tcnumber;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mobilePhone = mobilePhone;
        this.position = position;
        this.email = email;
        this.experience = experience;
        this.address = address;
        this.gender = gender;

    
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobilePhone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * @return the tcnumber
     */
    public String getTcnumber() {
        return tcnumber;
    }

    /**
     * @param tcnumber the tcnumber to set
     */
    public void setTcnumber(String tcnumber) {
        this.tcnumber = tcnumber;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
