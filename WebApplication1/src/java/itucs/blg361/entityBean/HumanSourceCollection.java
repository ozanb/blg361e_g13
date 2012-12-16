/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

import itucs.blg361.g13.Connect;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ozan
 */
public class HumanSourceCollection {
    
    public List<HumanResource> getAllHR() {
        List<HumanResource> result = new ArrayList<HumanResource>();
        try {
            Connect conn = new Connect();
            Statement statement = conn.getConn().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hrdepartment");
            while (resultSet.next()) {
                HumanResource HR = new HumanResource();
                HR.setId(resultSet.getInt("id"));
                HR.setName(resultSet.getString("name"));
                HR.setSurname(resultSet.getString("surname"));
                HR.setEmail(resultSet.getString("email"));
                HR.setMobilePhone(resultSet.getString("mobilePhone"));
                HR.setAddress(resultSet.getString("address"));
                HR.setPosition(resultSet.getString("position"));
                HR.setExperience(resultSet.getString("experience"));
                HR.setTcnumber(resultSet.getString("tcnumber"));
                HR.setBirthDate(resultSet.getString("birthDate"));
                HR.setGender(resultSet.getString("gender"));


                result.add(HR);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public HumanResource getHRById(int Id) {
        HumanResource HR = null;;
        String querry = "SELECT * FROM HRDEPARTMENT WHERE (ID = '" + Id + "')";
        try {
            Connect conn = new Connect();
            Statement statement = conn.getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(querry);
            while (resultSet.next()) {

                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String addres = resultSet.getString("addres");
                String cellphone = resultSet.getString("mobilePhone");
                String position = resultSet.getString("position");
                String experience = resultSet.getString("experience");
                String tcnumber = resultSet.getString("tcnumber");
                String birthDate = resultSet.getString("birthDate");
                String email = resultSet.getString("email");
                String gender = resultSet.getString("gender");


                HR = new HumanResource(Id, name, surname, addres, cellphone,
                        email, position, experience, tcnumber, birthDate, gender);


              //  kul = new Kullanici(Id, kad, ad, soyad, adres, ceptel, evtel, sifre,);

            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return HR;
    }
    
    public void deleteHR(HumanResource k) {
        try {
            Connect conn = new Connect();
            PreparedStatement statement = conn.getConn().prepareStatement("delete"
                    + "from hrdepartment where id = ?");
            statement.setInt(1, k.getId());
            statement.executeUpdate();
            conn.closeConn();
        } catch (SQLException ex) {
            Logger.getLogger(HumanResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addHR(HumanResource HR) {
        try {
            Connect conn = new Connect();
            PreparedStatement prepStatement = conn.getConn().prepareStatement
                    ("insert into hrdepartment(name, surname, email, mobilePhone, "
                    + "address, position, experience, tcnumber, birthDate, gender) values(?,?,?,?,?,?,?,?,?,?)");
            prepStatement.setString(1, HR.getName());
            prepStatement.setString(2, HR.getSurname());
            prepStatement.setString(3, HR.getEmail());
            prepStatement.setString(4, HR.getMobilePhone());
            prepStatement.setString(5, HR.getAddress());
            prepStatement.setString(6, HR.getPosition());
            prepStatement.setString(7, HR.getExperience());
            prepStatement.setString(8, HR.getTcnumber());
            prepStatement.setString(9, HR.getBirthDate());
            prepStatement.setString(10, HR.getGender());

            
            prepStatement.executeUpdate();
            conn.closeConn();

        } catch (SQLException ex) {
            Logger.getLogger(HumanSourceCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addHR(HumanResource HR, Integer id) {
        try {
            Connect conn = new Connect();
            PreparedStatement prepStatement = conn.getConn().prepareStatement
                    ("insert into hrdepartment(name, surname, email, mobilePhone, "
                    + "address, position, experience, tcnumber, birthDate, id) values(?,?,?,?,?,?,?,?,?,?)");
            prepStatement.setString(1, HR.getName());
            prepStatement.setString(2, HR.getSurname());
            prepStatement.setString(3, HR.getEmail());
            prepStatement.setString(4, HR.getMobilePhone());
            prepStatement.setString(5, HR.getAddress());
            prepStatement.setString(6, HR.getPosition());
            prepStatement.setString(7, HR.getExperience());
            prepStatement.setString(8, HR.getTcnumber());
            prepStatement.setString(9, HR.getBirthDate());
            prepStatement.setString(10, HR.getGender());

            prepStatement.setInt(11, id);


            
            prepStatement.executeUpdate();
            conn.closeConn();

        } catch (SQLException ex) {
            Logger.getLogger(HumanSourceCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateHR(HumanResource HR){
        Integer id = HR.getId();
        deleteHR(HR);
        addHR(HR, id);
    }
    
}
