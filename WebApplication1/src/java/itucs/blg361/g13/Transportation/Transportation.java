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
    private Integer id=0;
    private String  agenttosend="";
    private String  address="";
    private Integer noforder=0; 
    private Integer expense=0;
    private String  product="";
   
    
    public Transportation(){
        
}
    
      public Transportation(Integer id_in,String agenttosend_in,String address_in,Integer noforder_in,Integer expense_in,String product_in){
         id=id_in;
         agenttosend=agenttosend_in;
         address=address_in;
         noforder=noforder_in;
         expense=expense_in;
         product=product_in;
         
     
    }
      
      
          public void setId(Integer id_in){
        id=id_in;
    }    
      
            public void setAgenttosend(String agenttosend_in){
        agenttosend=agenttosend_in;
    } 
      
        public void setAddress(String address_in){
        address= address_in;
    }    

         public void setNoforder(Integer noforder_in){
        noforder = noforder_in;
    }
         
       public void setExpense(Integer expense_in){
       expense=expense_in;
    }
          
          public void setProductString(String product_in){
        product=product_in;
    }    
                         
                    
           public Integer getId(){
        return id;
    }     
                
               public String getAgenttosend(){
        return agenttosend;
    }
         
         public String getAddress(){
        return address;
    }
    public Integer getNoforder(){
        return noforder;
    }

         public Integer getExpense(){
        return expense;
    } 
   
      public String getProduct(){
        return product;
    } 
    
    
    
}