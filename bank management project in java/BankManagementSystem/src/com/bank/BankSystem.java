package com.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        int choice;

        do{
            System.out.println("\n---Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balence");
            System.out.println("5.Exit");
            System.out.println("Enter Choice:");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalence();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                case 6:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 5);

    }


    static void createAccount(){
        System.out.println("Enter Name:");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        accounts.add(new Account(accNo, balance, name));

        System.out.println("Account Created Successfully!");
    }


    static void depositMoney(){
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        for(Account acc : accounts){
            if (acc.accountNumber== accNo ){
                System.out.print("Enter Amount:");
                double amount = sc.nextDouble();
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account Not Found!");
    }

    static void withdrawMoney(){
        System.out.println("Enter Account Number: ");
        int accNo = sc.nextInt();

        for(Account acc : accounts){
            if (acc.accountNumber == accNo){
                System.out.println("Enter Amount:");
                double amount = sc.nextDouble();
                acc.withdraw(amount);
                return;

            }
            System.out.println("Account Not Found!");
        }
    }

    static void checkBalence(){
        System.out.println("Enter Account Number:");
        int accNo=sc.nextInt();

        for(Account acc : accounts){
            if(acc.accountNumber == accNo){
                acc.display();
                return;
            }

        }
        System.out.println("Account Not Found!");
    }





}
