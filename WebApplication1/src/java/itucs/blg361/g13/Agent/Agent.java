/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Agent;

/**
 *
 * @author Razi
 */

public class Agent {
    private Integer id = -1;
    private String name="";
    private String surname="";
    private String company="";
    private String comaddress="";
    private String comtel="";
    private Double owe= 0.0;
   
    
    public Agent(){
        
    }
    
     public Agent(Integer id_in,String name_in,String surname_in,String company_in,String comaddress_in,String comtel_in,Double owe_in){
         id = id_in;
         name = name_in;
         surname = surname_in;
         company=company_in;
         comaddress=comaddress_in;
         comtel=comtel_in;
         owe=owe_in;
     }
     
     public void setName(String name_in){
         name = name_in;
     }
     
     public void setSurname(String surname_in){
         surname = surname_in;
     }
     
     public void setCompany(String company_in){
         company=company_in;
     }
     
     public void setComaddress(String comaddress_in){
         comaddress=comaddress_in;
     }   
     
     public void setComtel(String comtel_in){
         comtel=comtel_in;
     }
     
     public void setOwe(Double owe_in){
         owe=owe_in;
     }
     
     public String getName(){
         return name;
     }
     
     public String getSurname(){
         return surname;
     }   
     
     public String getCompany(){
         return company;
     }
     
     public String getComaddress(){
         return comaddress;
     }
     
     public String getComtel(){
         return comtel;
     }
    
     public Double getOwe(){
         return owe;
     }
     
     public Integer getID(){
         return id;
     }
}