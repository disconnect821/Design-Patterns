package DesginPattern.BehaviouralPattern.observerPattern;

public class MobileDevice implements Device {

    @Override
    public void setTemp(float temp) {
        System.out.println("Mobile device temp shows : " + temp);
    }
}
