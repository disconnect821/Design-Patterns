package Basics.action;


import Basics.entities.UPI;
import Basics.entities.impl.DebitCard;
import Basics.service.PaymentService;

public class client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("Disconnect", new UPI("12324"));
        paymentService.addPaymentMethod("BloodLine", new DebitCard("4657456", "BloodLine"));
        paymentService.addPaymentMethod("Stone", new DebitCard("98089", "Stone"));

        paymentService.makePayment("Disconnect");
        paymentService.makePayment("BloodLine");
        paymentService.makePayment("Stone");
    }
}
