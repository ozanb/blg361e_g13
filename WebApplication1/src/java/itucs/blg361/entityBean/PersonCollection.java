/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

import itucs.blg361.g13.Connect;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author ozan
 */
public class PersonCollection {
    
        public List<Person> getAllPerson() {
        List<Person> result = new ArrayList<Person>();
        try {
            Connect conn = new Connect();
            Statement statement = conn.getConn().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from person");
            while (resultSet.next()) {
                Person k = new Person();
                k.setId(resultSet.getInt("id"));
                k.setName(resultSet.getString("name"));
                k.setSurName(resultSet.getString("surName"));
                k.setMobilePhone(resultSet.getString("mobilePhone"));
                k.setEmail(resultSet.getString("email"));
                k.setAddress(resultSet.getString("address"));
                k.setPosition(resultSet.getString("position"));
                k.setSalary(resultSet.getString("salary"));
                k.setUserName(resultSet.getString("userName"));
                k.setPassword(resultSet.getString("password"));
                //k.setBirthDate(resultSet.getDate("birthDate"));
                k.setEducation(resultSet.getString("education"));
                
                //java.util.Date jDate = new java.util.Date(resultSet.getDate("dateOfGettingJob").getTime());
                
                //k.setDateOfGettingJob(resultSet.getDate("dateOfGettingJob"));
                
                //k.setDateOfGettingJob(jDate);
                
                k.setUserType(resultSet.getInt("userType"));
                
                result.add(k);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
    
    
        public Person getPersonById(int Id) {
        Person per = null;
        String querry = "SELECT * FROM PERSON WHERE (ID = '" + Id + "')";
        try {
            Connect conn = new Connect();
            Statement statement = conn.getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(querry);
            while (resultSet.next()) {

                String name = resultSet.getString("name");
                String surName = resultSet.getString("surName");
                String mobilePhone = resultSet.getString("mobilePhone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String position = resultSet.getString("position");
                String salary = resultSet.getString("salary");
                int userType = resultSet.getInt("userType");
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                Date birthDate = resultSet.getDate("birthDate");
                String education = resultSet.getString("education");
                Date dateOfGettingJob = resultSet.getDate("dateOfGettingJob");


//                Integer kTip = resultSet.getInt("kullTip");
                per = new Person(Id, name, surName, mobilePhone, email, address,
                        position, salary, userType, userName, password, birthDate, education, dateOfGettingJob);


              //  kul = new Kullanici(Id, kad, ad, soyad, adres, ceptel, evtel, sifre,);

            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return per;
    }
    
}
