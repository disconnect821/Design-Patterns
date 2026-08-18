package Basics.entities.impl;


import Basics.entities.Card;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String cardHolder){
        super(cardNumber, cardHolder);
    }

    @Override
    public void pay() {
        System.out.println("Payment done using Debit Card method");
    }
}
