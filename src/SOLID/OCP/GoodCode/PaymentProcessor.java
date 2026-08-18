package SOLID.OCP.GoodCode;

//Created the process Payment such that anu payment method can be accepted,
//Following OCP principle.
public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod,int amount){
       paymentMethod.pay(amount); //Runtime Poly
    }
}
