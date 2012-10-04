/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailerSystem;

/**
 *
 * @author hmehr
 */
public class Warehouse {

    ItemShippingStatus shipItem(Item item, Customer info) {
        ItemShippingStatus itemShippingStatus = new ItemShippingStatus();
        itemShippingStatus.setPrice(item.getUnitPrice() * item.getQuantity());
        itemShippingStatus.setItem(item);
        int itemsAvailable = checkItemAvailability(item);
        int quantityRequested = itemsAvailable - item.getQuantity();
        if (quantityRequested >= 0) //
        {
            itemShippingStatus.setQuantity(item.getQuantity());
            System.out.println(String.valueOf(itemsAvailable) + quantityRequested + item.getProductType() + "manufactured by + " + item.getManufacturerName() + " was sent to " + info.getName() + " to the following address: ");
            System.out.println(info.getStreet1() + ", " + info.getStreet2() + "," + info.getCity() + "," + info.getState() + "," + info.getCountry() + "-" + info.getZip());
            setStockAvailibility(quantityRequested);

        } else {
            itemShippingStatus.setQuantity(0);
        }

        return itemShippingStatus;
    }

    private int checkItemAvailability(Item item) {
        //throw new UnsupportedOperationException("Not yet implemented");
        return 10;
    }

    private void setStockAvailibility(int i) {
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
