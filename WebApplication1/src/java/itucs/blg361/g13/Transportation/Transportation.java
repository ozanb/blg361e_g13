/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Transportation;

/**
 *
 * @author Razi
 */

public class Transportation {
    private String company="";
    private String country="";
    private String city="";
   

   
    
    public Transportation(){
        
}
    
      public Transportation(String company_in,String country_in,String city_in){
        company=company_in;
        country = country_in;
        city = city_in;
     
     
    }
            public void setCompany(String company_in){
        company=company_in;
    } 
      
        public void setCountry(String country_in){
        country = country_in;
    }    

         public void setCity(String city_in){
        city = city_in;
    }
         
  
          
                         
                    
                
                
        
               public String getCompany(){
        return company;
    }
         
         public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    }

        
   
 
    
    
    
}