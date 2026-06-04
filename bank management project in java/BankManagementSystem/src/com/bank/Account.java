package com.bank;

public class Account {
    String name;
    int accountNumber;
    double balence;

    public Account(int accountNumber, double balence, String name) {
        this.accountNumber = accountNumber;
        this.balence = balence;
        this.name = name;
    }

    void deposit(double amount){
        balence += amount;
        System.out.println("Amount Diposited :" +amount);
    }

    void withdraw(double amount){
        if(amount<= balence){
            balence -= amount;
            System.out.println("Amount withdrawn:"+ amount);

        }else{
            System.out.println("Insufficient Balence!");
        }
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balence:"+ balence);
    }
}
