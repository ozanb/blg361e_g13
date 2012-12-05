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
    
    private Integer ID= -1;
    private String name= "";
    private Double weight= 0.0;
    private Double price= 0.0;
    private Integer daily_want= 0;
    
    public Raw(){
        
    }
    
    public Raw(String name_in){
        name = name_in;

    }
    
    public Raw(Integer ID_in, String name_in, Double weight_in, Double price_in, Integer want_in){
        ID=ID_in;
        name = name_in;
        weight = weight_in;
        price = price_in;
        daily_want = want_in;        
    }
    
    public void setName(String name_in){
        name = name_in;
    }
    
    public void setWeight(Double weight_in){
        weight = weight_in;
    }
    
    public void editWeight(Double weight_in){
        weight = weight + weight_in;
    }
    
    public void emptyWeight(){
        weight = 0.0;
    }
    
    public void setPrice(Double price_in){
        price = price_in;
    }
    
    public void setWant(Integer want_in){
        daily_want = want_in;
    }
    
    public String getName(){
        return name;
    }
    
    public Double getWeight(){
        return weight;
    }
    
    public Double getPrice(){
        return price;
    }
    
    public Integer getWant(){
        return daily_want;
    }
    
    public Integer getID(){
        return ID;
    }
}
