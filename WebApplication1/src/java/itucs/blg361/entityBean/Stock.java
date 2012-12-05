/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

/**
 *
 * @author ozan
 */
public class Stock {
    
    private int id;
    private String productName;
    private int nOfStock;
    private String storePlace;
    
    public Stock(){
    }
    
    public Stock(int id, String productName, int nOfStock, String storePlace){
    
        this.id = id;
        this.productName = productName;
        this.nOfStock = nOfStock;
        this.storePlace = storePlace;
        
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
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the nOfStock
     */
    public int getnOfStock() {
        return nOfStock;
    }

    /**
     * @param nOfStock the nOfStock to set
     */
    public void setnOfStock(int nOfStock) {
        this.nOfStock = nOfStock;
    }

    /**
     * @return the storePlace
     */
    public String getStorePlace() {
        return storePlace;
    }

    /**
     * @param storePlace the storePlace to set
     */
    public void setStorePlace(String storePlace) {
        this.storePlace = storePlace;
    }
}
