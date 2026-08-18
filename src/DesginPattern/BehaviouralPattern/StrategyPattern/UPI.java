package DesginPattern.BehaviouralPattern.StrategyPattern;

public class UPI implements PaymentMethod {
    String upiId;

    public UPI(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Payment done using UPI method");
    }
}
