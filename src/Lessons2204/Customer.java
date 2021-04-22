package Lessons2204;

import java.util.ArrayList;

public class Customer extends Person{

    private int customerNr;
    private ArrayList<Address> addresses;

    public Customer(int customerNr, String fName, String lName) {

        super(fName, lName);
        //super("Hansi", "Hinterseer");  schlechte Lösung
        this.customerNr = customerNr;
        this.addresses = new ArrayList<>();
    }

    public int getCustomerNr() {
        return customerNr;
    }

    public void setCustomerNr(int customerNr) {
        this.customerNr = customerNr;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address a){
        addresses.add(a);
    }


    @Override
    public String toString() {
        return "Customer: " + customerNr + " " +
                  firstName + " " +
                 lastName + "\n" + " " +
                 addresses;
    }
}

