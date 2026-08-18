package SOLID.OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("making payment via credit card");
    }
}
