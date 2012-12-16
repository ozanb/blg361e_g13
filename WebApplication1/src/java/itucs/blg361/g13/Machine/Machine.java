/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Machine;

/**
 *
 * @author Razi
 */

public class Machine {
    private Integer id= -1;
    private String kind="";
    private Integer number=0;
    private Double expense=0.0;
    private Integer productperday=0;

   
    
    public Machine(){
        
}
    
      public Machine(Integer id_in,String kind_in,Integer number_in,Double expense_in,Integer productperday_in){
        id=id_in;  
        kind=kind_in;
        number=number_in;
       
        expense=expense_in;
        productperday=productperday_in;
       
    }
            public void setId(Integer id_in){
           id=id_in;
    }
      
        public void setKind(String kind_in){
        kind=kind_in;
    }    

         public void setNumber(Integer number_in){
           number=number_in;
    }
         
    
        
              public void setExpense(Double expense_in){
           expense=expense_in;
    }
              
                        public void setProductperday(Integer productperday_in){
       productperday=productperday_in;
    }
           
                
                
        
         
              public Integer getId(){
        return id;
    }    
              
         
         public String getKind(){
        return kind;
    }
    public Integer getNumber(){
        return number;
    }

        
      
         
             public Double getExpense(){
        return expense;
    }
             
                 public Integer getProductperday(){
        return productperday;
    }


    
   
                 
}