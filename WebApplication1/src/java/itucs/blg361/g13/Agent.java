/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */

public class Agent {
    private String name="";
    private String surname="";
    private String company="";
    private String comaddress="";
    private String comtel="";
    private String buysell="";
   
    
    public Agent(){
        
}
    
      public Agent(String name_in,String surname_in,String company_in,String comaddress_in,String comtel_in,String buysell_in){
        name = name_in;
        surname = surname_in;
        company=company_in;
        comaddress=comaddress_in;
        comtel=comtel_in;
        buysell=buysell_in;
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
                         public void setBuysell(String buysell_in){
        buysell=buysell_in;
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
    public String getBuysell(){
        return buysell;
    
    }
    
    
    
    
}