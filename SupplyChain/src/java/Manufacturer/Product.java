/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manufacturer;

/**
 *
 * @author hmehr
 */
public class Product {
    //
    
    private String manufacturerName;
    public String getManufacturerName(){
        return this.manufacturerName;
    }
    
    public void setManufacturerName(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }
    
    private ProductType productType;
    public ProductType getProductType(){
        return this.productType;
    }
    
    public void setProductType(ProductType productType){
        this.productType = productType;
    }
    
    private float unitPrice;
    public float getUnitPrice(){
        return this.unitPrice;
    }
    
    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }
    
            
            
    
}

