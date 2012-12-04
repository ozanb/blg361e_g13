
package itucs.blg361.pojo;

/**
 *
 * @author Razi
 */
public class Animal {
    private Integer id=0;
    private String kind="";
    private Integer number=0;
    private Integer age=0;
    private Integer expense=0;
    private Integer productperday=0;
   
    
    
    public Animal(){
        
    }
    
     public Animal(Integer id_in,String kind_in,Integer number_in,Integer age_in,Integer expense_in,Integer productperday_in){
        id=id_in;
        kind=kind_in;
        number=number_in;
        age=age_in;
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
       public void setAge(Integer age_in){
        age=age_in;
    }
         public void setExpense(Integer expense_in){
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
       public Integer getAge(){
        return age;
    }
          public Integer getExpense(){
        return expense;
    }
         public Integer getProductperday(){
        return productperday;
    }
  
    
    
    
                   
    
    
}
