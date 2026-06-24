package com.src;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balance to create account");
        int balance=sc.nextInt();
        sc.nextLine();
        Account account = new Account(balance);
        System.out.println("Enter option [credit/debit]");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("credit")){
            System.out.print("Enter amount:");
            int amount=sc.nextInt();
            account.credit(amount);
        }else if(s.equalsIgnoreCase("debit")){
            System.out.print("Enter amount:");
            int amount=sc.nextInt();
            account.debit(amount);
        }
        else {
            System.out.println("Invalid choice");
        }

        System.out.println("Your Balance is: "+account.getBalance());

    }
}
