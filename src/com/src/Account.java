package com.src;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void credit(int amount){
        balance+=amount;
    }

    public void debit(int amount){
        if(amount>balance){
            System.out.println("The withdrowal amount exceeds Balance");
        }
        else{
            balance-=amount;
        }
    }

    public int getBalance(){
        return balance;
    }
}
