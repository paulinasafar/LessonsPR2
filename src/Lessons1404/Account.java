package Lessons1404;

public class Account {
private String owner;
private String iban;
private String bic;
private int accountID;
private static int uniqueID = 1;
private double balance;

public Account(String owner, String iban, String bic) {
    this.balance = 0.0;
    this.owner = owner;
    this.iban = iban;
    this.bic = bic;
    this.accountID = uniqueID;
    uniqueID += 1;
}

public int getAccountID() {
    return accountID;
}

public void setOwner(String name) {
        if (owner != null) {
            this.owner = owner;
        }
    }

public String getOwner() {
    return this.owner;
}

public void setIban(String iban) {
    if (iban != null) {
        this.iban = iban;
    }
}

public String getIban() {
    return this.iban;
}

public double add(double wert) {
    this.balance += wert;
    return this.balance;
}

public double deposit(double wert) {

    if ((this.balance - wert) < 0) {
        System.out.println("You do not have sufficient funds.");
        return this.balance;
    } else
        {
        this.balance -= wert;
        return this.balance;}
}
public double getBalance() {
    return balance;
}

@Override
    public String toString(){
        return "Account " + getAccountID() + " from owner " + owner + " with balance " + balance + " is OK.";
}

}
