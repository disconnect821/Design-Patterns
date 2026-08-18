package DesginPattern.BehaviouralPattern.CommandPattern;

public class SmartRemote implements Remote{
    @Override
    public void pressButton(Button button, ButtonCommand buttonCommand) {
        button.setButtonCommand(buttonCommand);
        button.onClick();
    }

    public static void main(String[] args) {
        Remote smartRemote = new SmartRemote();
        Button button = new Button();
        smartRemote.pressButton(button, new BoldCommand());
        smartRemote.pressButton(button, new ItalicButtonCommand());
    }
}
