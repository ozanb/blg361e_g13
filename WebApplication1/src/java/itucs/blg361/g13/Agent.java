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
   
    
    public Agent(){
        
}
    
      public Agent(String name_in,String surname_in){
        name = name_in;
        surname = surname_in;
       
    }
        public void setName(String name_in){
        name = name_in;
    }    

         public void setSurname(String surname_in){
        surname = surname_in;
    }
         
         public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    
    
    
    
    
    
}