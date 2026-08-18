package DesginPattern.BehaviouralPattern.StrategyPattern;



public class CreditCard implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card method");
    }
}
