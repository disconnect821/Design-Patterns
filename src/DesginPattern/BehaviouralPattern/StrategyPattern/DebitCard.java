package DesginPattern.BehaviouralPattern.StrategyPattern;



public class DebitCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment done using Debit Card method");
    }
}
