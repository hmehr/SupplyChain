/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailerSystem;

/**
 *
 * @author hmehr
 */
public class Retailer {

    Warehouse warehouseA;
    Warehouse warehouseB;
    Warehouse warehouseC;

    public Retailer(Warehouse warehouseA, Warehouse warehouseB, Warehouse warehouseC) {
        this.warehouseA = warehouseA;
        this.warehouseB = warehouseB;
        this.warehouseC = warehouseC;
    }

    public ItemShippingStatusList shipGoods(ItemList itemList, Customer info) {
        ItemShippingStatusList itemShippingStatusList = new ItemShippingStatusList();
        for (Item item : itemList.getItems()) {
            if (validate(item)) {
                ItemShippingStatus warehouseAitemShippingStatus = warehouseA.shipItem(item, info);
                if (warehouseAitemShippingStatus.getQuantity() == 0) {
                    //if warehouse A cannot supply the requested item as many as asked quanities we delegate the tast to warehouse B
                    ItemShippingStatus warehouseBItemShippingStatus = warehouseB.shipItem(item, info);
                    if (warehouseBItemShippingStatus.getQuantity() == 0) {
                        //if warehouse B cannot supply the requested item as many as asked quanities we delegate the tast to warehouse C
                        ItemShippingStatus warehouseCItemShippingStatus = warehouseC.shipItem(item, info);
                        itemShippingStatusList.getItemShippingStatusList().add(warehouseCItemShippingStatus);
                    } else {
                        itemShippingStatusList.getItemShippingStatusList().add(warehouseBItemShippingStatus);
                    }
                } else {
                    itemShippingStatusList.getItemShippingStatusList().add(warehouseAitemShippingStatus);
                }

            }

        }

        return itemShippingStatusList;
    }

    private boolean validate(Item item) {
        return true;
    }
}
