/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

/**
 *
 * @author Razi
 */

public class Machine {
    private String kind="";
    private String number="";
    private String weight="";

   
    
    public Machine(){
        
}
    
      public Machine(String kind_in,String number_in,String weight_in){
          
        kind=kind_in;
        number=number_in;
        weight=weight_in;
       
    }
        public void setKind(String kind_in){
        kind=kind_in;
    }    

         public void setNumber(String number_in){
           number=number_in;
    }
         
        public void setWeight(String weight_in){
       weight=weight_in;
    } 
           
                
                
        
         
         
         public String getKind(){
        return kind;
    }
    public String getNumber(){
        return number;
    }

        
         public String getWeight(){
        return weight;
    }

    
    
    
    
}