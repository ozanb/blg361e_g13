/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.pojo;

import java.util.Date;

/**
 *
 * @author ozan
 */
public class Person {
    
    private int id;
    private String name;
    private String surName;
    private String mobilePhone;
    private String email;
    private String address;
    private String position;
    private String salary;
    private int userType;
    private String userName;
    private String password;
    private Date birthDate;
    private String education;
    private Date dateOfGettingJob;

    
    public Person(){
    
    }
    
    public Person(int id, String name, String surName,String mobilePhone, String email,
            String address, String position, String salary, int userType, String userName,
            String password, Date birthDate, String education, Date dateOfGettingJob){
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.salary = salary;
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.birthDate = birthDate;
        this.education = education;
        this.dateOfGettingJob = dateOfGettingJob;
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
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
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
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the userType
     */
    public int getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return the dateOfGettingJob
     */
    public Date getDateOfGettingJob() {
        return dateOfGettingJob;
    }

    /**
     * @param dateOfGettingJob the dateOfGettingJob to set
     */
    public void setDateOfGettingJob(Date dateOfGettingJob) {
        this.dateOfGettingJob = dateOfGettingJob;
    }
    
}

