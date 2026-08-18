package DesginPattern.BehaviouralPattern.CommandPattern;

public class BoldCommand implements ButtonCommand{
    @Override
    public void execute() {
        System.out.println("Bold Button Clicked");
    }
}
