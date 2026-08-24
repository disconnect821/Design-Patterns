package DesginPattern.BehaviouralPattern.CommandPattern;

public class Button {

    private ButtonCommand buttonCommand;

    public void setButtonCommand(ButtonCommand buttonCommand){
        this.buttonCommand = buttonCommand;
    }

    public void onClick(){
        buttonCommand.execute();
    }
}
