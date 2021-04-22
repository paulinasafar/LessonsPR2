package Lessons2204;

import java.util.ArrayList;
import java.util.HashMap;

public class Property {
    // latitute is width
    //longitude is length
    private double latitute, longitude;
    private double sizeInm2;
    private ArrayList<String> lender;  // we can also initialise here -> this code is executed in Constructor
    private HashMap<String, Double> moneyOwed;


    public Property(double latitute, double longitude, double size, String firstOwner) {
        this.latitute = latitute;
        this.longitude = longitude;
        this.sizeInm2 = size;
        this.lender = new ArrayList<String>(); // for complex data types - we have to create an instance
        this.lender.add(firstOwner);
        this.moneyOwed = new HashMap<String, Double>();
    }

    // if we get a loan for a property we have to add an owner
    public void addMoneyLender(String lender, double money) {
        this.lender.add(lender);
        if (moneyOwed.containsKey(lender)) {
            // we already owe something
            double m = moneyOwed.get(lender);
            moneyOwed.put(lender, money + m);
        } else {
            // first time we borrow something
            moneyOwed.put(lender, money);
        }
        //there is a more efficient metho
        // instead
        double oldmoney = moneyOwed.getOrDefault(lender, 0.0);
        moneyOwed.put(lender, money + oldmoney);
    }
    // remove owner only possible if we are no longer borrowing monty for them

    public boolean removeLender(String o) {
        Double m = moneyOwed.get(o);
        if (m == null) {
            // we do now owe money we can try to remove name out of Lender list
            return lender.remove(o);
        }
        // we could have a problem here because m is double and dous not save the number exactly
        if (m > 0.0) {
            // m = 0.00000001 is m= 0;
            return false;
        }
        lender.remove(o);
        moneyOwed.remove(0);
        return true;
    }
    // payback - falls es die Person mi dem Namen Lender gibt, soll der Schuldenstand um die Summe amount erniedrigt wird
    // -> liefert true zurück falls erfogreich, Schulden gesenkt oder getilgt wurden
    // -> liefer fals zurück wenn es Lender nicht gibt ODER wenn wir mehr Geld zurück zahlen als noch schuldig sing (dann nichts abziehen)

    public boolean payback(String lender, double amount) {

        if (moneyOwed.containsKey(lender) && moneyOwed.get(lender) > amount) {
            moneyOwed.put(lender, moneyOwed.get(lender) - amount);
            return true;
        }
        else {
            return false;
        }
    }


}
