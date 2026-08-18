package Basics.entities.impl;

import Basics.entities.Card;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card method");
    }
}
