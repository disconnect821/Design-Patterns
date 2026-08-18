package DesginPattern.BehaviouralPattern.CommandPattern;

public class ItalicButtonCommand implements ButtonCommand{
    @Override
    public void execute() {
        System.out.println("Italic button Clicked");
    }
}
