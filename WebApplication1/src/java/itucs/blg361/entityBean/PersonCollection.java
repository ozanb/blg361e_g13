/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

import itucs.blg361.g13.Connect;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;



/**
 *
 * @author ozan
 */
public class PersonCollection {
    
        public Person getPersonById(int Id) {
        Person per = null;
        String querry = "SELECT * FROM PERSON WHERE (ID = '" + Id + "')";
        try {
            Connect conn = new Connect();
            Statement statement = conn.getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(querry);
            while (resultSet.next()) {

                String name = resultSet.getString(2);
                String surName = resultSet.getString(3);
                String mobilePhone = resultSet.getString(4);
                String email = resultSet.getString(5);
                String address = resultSet.getString(6);
                String position = resultSet.getString(7);
                String salary = resultSet.getString(8);
                int userType = resultSet.getInt(9);
                String userName = resultSet.getString(10);
                String password = resultSet.getString(11);
                Date birthDate = resultSet.getDate(12);
                String education = resultSet.getString(13);
                Date dateOfGettingJob = resultSet.getDate(14);


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
