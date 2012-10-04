/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manufacturer;

/**
 *
 * @author hmehr
 */
class PurchaseOrder {

    
    String orderNum;

    public String getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
    String customerRef;

    public String getCustomerRef() {
        return this.customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }
    Product product;

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    int quantity;

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    float unitPrice;

    public float getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = quantity;
    }
}
