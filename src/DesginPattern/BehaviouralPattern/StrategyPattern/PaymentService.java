package DesginPattern.BehaviouralPattern.StrategyPattern;


public class PaymentService {
    private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void completePayment(){
        paymentMethod.pay();
    }
}
