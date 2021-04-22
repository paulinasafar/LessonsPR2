package Lessons2204;

public class CustomerWithAdressDemo {

    public static void main(String[] args) {


        Customer cust1 = new Customer(1);
        Customer cust2 = new Customer(2);


        Address add1 = new Address("Strasse1", "8112", "Graz", "Österreich");
        Address add4 = new Address("Ulica55", "10020", "Zagreb", "Croatia");
        Address add5 = new Address("Square55", "EA201", "London", "Great Britain");

        cust1.addAddress(add1);
        cust2.addAddress(add4);
        cust2.addAddress(add5);

        System.out.println(cust1);
        System.out.println(cust2);

        System.out.println();
        cust1.firstName = "Franzl";
        cust1.lastName = "Weissi";
        System.out.println();
        cust2.firstName = "Martina";
        cust2.lastName = "Schwarzi";
        System.out.println();
        System.out.println(cust1);
        System.out.println(cust2);


    }

}
