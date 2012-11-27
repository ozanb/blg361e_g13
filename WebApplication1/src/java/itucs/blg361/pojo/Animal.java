
package itucs.blg361.pojo;

/**
 *
 * @author Razi
 */
public class Animal {
    private String kind="";
    private String number="";
    private String product="";
   
    
    
    public Animal(){
        
    }
    
     public Animal(String kind_in,String number_in,String product_in){
        kind=kind_in;
        number=number_in;
        product=product_in;
     
       
    }
     public void setKind(String kind_in){
       kind=kind_in;
    }
     public void setNumber(String number_in){
        number=number_in;
    }
          public void setProduct(String product_in){
        product=product_in;
    }

    
 
      
     
     
     
     
     
     
     public String getKind(){
        return kind;
    }
    public String getNumber(){
        return number;
    }
         public String getProduct(){
        return product;
    }
  
    
    
    
                   
    
    
}
