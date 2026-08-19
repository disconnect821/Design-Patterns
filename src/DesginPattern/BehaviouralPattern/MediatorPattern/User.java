package DesginPattern.BehaviouralPattern.MediatorPattern;

public class User implements Colleague {

    private final String name;
    public Mediator mediator;

    public User(String name, Mediator mediator){
        this.mediator = mediator;
        this.name = name;
        mediator.register(this);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void sendTo(String to, String message) {
        mediator.sendTo(this, to, message);
    }

    @Override
    public void sendAll(String message) {
        mediator.sendAll(this, message);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println(this.name + " Message " + message + " received from " + from);
    }
}
