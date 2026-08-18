package DesginPattern.BehaviouralPattern.StrategyPattern;


public class PaymentClient {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentService paymentService = new PaymentService(creditCard);

        paymentService.completePayment();

        PaymentMethod debitCard = new DebitCard();
        paymentService = new PaymentService(debitCard);

        paymentService.completePayment();
        System.out.println();
    }
}
