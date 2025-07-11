package com.codewithmosh.store;

public class Paypal implements PaymentService {
    @Override
    public void processPayment(double amount) {

        System.out.println("Paypal");
        System.out.println("amount " + amount);

    }

}
