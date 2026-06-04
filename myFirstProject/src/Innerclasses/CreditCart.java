package Innerclasses;

public class CreditCart implements Payment {



    private String creditCardNumber;

    public CreditCart(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using Credit Cart.");

    }
}
