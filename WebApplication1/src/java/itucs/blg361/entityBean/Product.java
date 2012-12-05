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
    
    private int id;
    private String productKind;
    private int nOfProduct;
    private int weight;
    private int price;
    private int productPerDay;
    
    /**
     *
     */
    public Product(){
    
    }
    
    public Product(int id, String productKind, int nOfProduct, int weight,
            int price, int productPerDay){
    
        this.id = id;
        this.productKind = productKind;
        this.nOfProduct = nOfProduct;
        this.weight = weight;
        this.price = price;
        this.productPerDay = productPerDay;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the productKind
     */
    public String getProductKind() {
        return productKind;
    }

    /**
     * @param productKind the productKind to set
     */
    public void setProductKind(String productKind) {
        this.productKind = productKind;
    }

    /**
     * @return the nOfProduct
     */
    public int getnOfProduct() {
        return nOfProduct;
    }

    /**
     * @param nOfProduct the nOfProduct to set
     */
    public void setnOfProduct(int nOfProduct) {
        this.nOfProduct = nOfProduct;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the productPerDay
     */
    public int getProductPerDay() {
        return productPerDay;
    }

    /**
     * @param productPerDay the productPerDay to set
     */
    public void setProductPerDay(int productPerDay) {
        this.productPerDay = productPerDay;
    }
    
}
