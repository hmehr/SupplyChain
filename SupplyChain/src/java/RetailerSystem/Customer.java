/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailerSystem;

/**
 *
 * @author hmehr
 */
public class Customer {
    
    //customerReferenceNumber (int), name (String), street1 (String), street2 (string), city (string), 
    //state (string), zip (string), country (string).
    private int customerReferenceNumber;
    private String name;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private String country;

    /**
     * @return the customerReferenceNumber
     */
    public int getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    /**
     * @param customerReferenceNumber the customerReferenceNumber to set
     */
    public void setCustomerReferenceNumber(int customerReferenceNumber) {
        this.customerReferenceNumber = customerReferenceNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * @param street1 the street1 to set
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * @return the street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * @param street2 the street2 to set
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
