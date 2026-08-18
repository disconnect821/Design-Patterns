package DesginPattern.BehaviouralPattern.observerPattern;

public class ComputerDevice implements Device {
    @Override
    public void setTemp(float temp) {
        System.out.println("Computer device temp shows : " + temp);
    }
}
