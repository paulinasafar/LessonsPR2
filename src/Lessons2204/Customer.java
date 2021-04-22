package Lessons2204;

import java.util.ArrayList;

public class Customer {

    private int customerNr;
    private ArrayList<Address> addresses;

    public Customer(int customerNr) {
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
        return "Customer{" +
                "customerNr=" + customerNr +
                ", addresses=" + addresses +
                '}';
    }
}
