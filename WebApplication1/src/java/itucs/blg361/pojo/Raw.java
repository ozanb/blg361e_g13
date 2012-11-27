/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.pojo;

/**
 *
 * @author Nadir
 */
public class Raw {
    
    private String name= "";
    private Integer amount= 0;
    private Double unit_cost= 0.0;
    private Integer daily_want= 0;
    
    public Raw(){
        
    }
    
    public Raw(String name_in){
        name = name_in;

    }
    
    public Raw(String name_in, Integer amount_in, Double cost_in, Integer want_in){
        name = name_in;
        amount = amount_in;
        unit_cost = cost_in;
        daily_want = want_in;        
    }
    
    public void setName(String name_in){
        name = name_in;
    }
    
    public void setAmount(Integer amount_in){
        amount = amount_in;
    }
    
    public void editAmount(Integer amount_in){
        amount = amount + amount_in;
    }
    
    public void emptyAmount(){
        amount = 0;
    }
    
    public void setCost(Double cost_in){
        unit_cost = cost_in;
    }
    
    public void setWant(Integer want_in){
        daily_want = want_in;
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getAmount(){
        return amount;
    }
    
    public Double getCost(){
        return unit_cost;
    }
    
    public Integer getWant(){
        return daily_want;
    }
}
