package Basics.entities;

abstract public class Card implements PaymentMethod{
    String cardNumber;
    String cardHolder;

    public Card(String cardNumber, String cardHolder) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


}
