/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.wicket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author zafer.ozturk
 * 
 * Manages the database operation of the Message table(class)
 */
public class MessageDAO {
    Connection db;
    public MessageDAO(String dbFilePath){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException(e.getMessage());
        }

        try {
            String jdbcURL = "jdbc:sqlite:" + dbFilePath;
            this.db = DriverManager.getConnection(jdbcURL);
        } catch (SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    /**
     * 
     * @param message 
     * persists message
     */
    public void persist(Message message){
        
    }
    /**
     * 
     * @param message 
     * removes message
     */
    public void remove(Message message){
        
    }
    /**
     * 
     * @param message
     * updates message
     */
    public void update(Message message){
        
    }
    /**
     * 
     * @return entire Messages
     */
    public List<Message> list(){
         List<Message> messages = new LinkedList<Message>();
    try {
        String query = "SELECT ID, MESSGAE, TO, FROM, FROM MESSAGE";
        Statement statement = this.db.createStatement();
        ResultSet results = statement.executeQuery(query);
        while (results.next()) {
            Integer id = results.getInt("ID");
            String body = results.getString("MESSAGE");
            String from = results.getString("TO");
            String to = results.getString("FROM");
            Message message = new Message();
            message.setFrom(from);
            message.setMessage(body);
            message.setTo(to);
            message.setId(id);
            messages.add(message);
        }
        results.close();
        statement.close();
    } catch (SQLException e) {
        throw new UnsupportedOperationException(e.getMessage());
    }
    return messages;
    }
    
}
