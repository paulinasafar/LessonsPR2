package Lessons1404;

import java.util.ArrayList;
import java.util.Arrays;

public class BankDemo {

    public static void main(String[] args) {

        Account first = new Account("John Brown", "AT123456789", "ATBBXX2");
        Account second = new Account("Martina Weiss", "AT987654321", "ATWTYX2");
        Account third = new Account("Laura Schwarz", "AT987456321", "ATZTRX2");

        System.out.println();
        System.out.println(first.getOwner());
        System.out.println(first.getIban());


       first.add(65.98);
       first.add(987.00);
       second.add(12565.98);
       third.add(9874.98);

        second.deposit(263.98);
        third.deposit(974.98);
        first.deposit(4562565.98);

        System.out.println("First Account balance: " + first.getBalance());
        System.out.println("Second Account balance: " + second.getBalance());
        System.out.println("Third Account balance: " + third.getBalance());
        System.out.println();

        Account[] accountsArray = new Account[3];
        accountsArray[0] = first;
        accountsArray[1] = second;
        accountsArray[2] = third;

        for (int i = 0; i < accountsArray.length; i++) {
            System.out.println("Balance for " + (i+1) + " is " + accountsArray[i].getBalance());
        }
        System.out.println();
//        for (int i = 0; i < accountsArray.length; i++) {
//            System.out.println(accountsArray[i]);
//        }

        for (int i = 0; i < accountsArray.length; i++) {
                System.out.println(accountsArray[i]);
        }


//        ArrayList<Account> accounts = new ArrayList<Account>();
//        accounts.add(first);
//        accounts.add(second);
//        accounts.add(third);



    }
}
