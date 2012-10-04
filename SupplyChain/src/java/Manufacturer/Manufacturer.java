/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manufacturer;

/**
 *
 * @author hmehr
 */
public class Manufacturer {
    
    public boolean processPurchaseOrder(PurchaseOrder aPO){
        return true;
    }
    
    public Product getProductInfo(String aProdName){
        
        return null;
    }
    
    public boolean receivePayment(String orderNum, float totalPrice){
        return true;
    }
    
    private boolean produce(String productName, int quantity) {
        return true;
    }
    
}
