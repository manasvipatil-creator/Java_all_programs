package threadDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balence = 100;

    private final Lock lock = new ReentrantLock();

    public    void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to " + amount);
       try{
           if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                   if (balence >= amount){


                   }else {


                   }

           }

       }catch (Exception e){


       }


    }
}
