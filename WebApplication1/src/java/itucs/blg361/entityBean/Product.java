/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

/**
 *
 * @author ozan
 */
public class Product {
    
    private Integer id = 0;
    private String kind = "";
    private Double weight = 0.0;
    private Double price = 0.0;
    private Integer productPerDay = 0;
    
    /**
     *
     */
    public Product(){
    
    }
    
    public Product(Integer id, String kind, Double weight,
            Double price, Integer productPerDay){
    
        this.id = id;
        this.kind = kind;
        this.weight = weight;
        this.price = price;
        this.productPerDay = productPerDay;
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the productKind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param productKind the productKind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }



    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the productPerDay
     */
    public Integer getProductPerDay() {
        return productPerDay;
    }

    /**
     * @param productPerDay the productPerDay to set
     */
    public void setProductPerDay(Integer productPerDay) {
        this.productPerDay = productPerDay;
    }
    
}