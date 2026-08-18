package Basics.service;

import Basics.entities.PaymentMethod;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethodStorage;

    public PaymentService(){
        this.paymentMethodStorage = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        paymentMethodStorage.put(name, pm);
    }
    public void makePayment(String name){
        PaymentMethod paymentMethod = paymentMethodStorage.get(name);
        paymentMethod.pay();
    }
}
