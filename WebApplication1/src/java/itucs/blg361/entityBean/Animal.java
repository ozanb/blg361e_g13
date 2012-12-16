
package itucs.blg361.entityBean;

/**
 *
 * @author Razi
 */
public class Animal {
    private Integer id = -1;
    private String kind = "";
    private Integer age = 0;
    private Integer productperday = 0;   
    private Integer number = 0;
    private Double expense = 0.0;

   
    
    
    public Animal(){
        
    }
    
    public Animal(Integer id_in, String kind_in, Integer age_in, Integer product_in, Integer number_in, Double expense_in){
        id=id_in;
        kind=kind_in;
        age=age_in;
        productperday=product_in;        
        number=number_in;
        expense=expense_in;
     
       
    }
    public void setKind(String kind_in){
       kind=kind_in;
    }
    public void setNumber(Integer number_in){
        number=number_in;
    }
    public void setProduct(Integer product_in){
        productperday=product_in;
    }
    public void setAge(Integer age_in){
        age=age_in;
    }
    public void setExpense(Double exp_in){
        expense=exp_in;
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
    public Integer getProduct(){
        return productperday;
    }
    public Integer getAge(){
        return age;
    }
    public Double getExpense(){
        return expense;
    }
  
    
    
    
                   
    
    
}
