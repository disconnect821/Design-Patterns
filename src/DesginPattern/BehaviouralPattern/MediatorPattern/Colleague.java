package DesginPattern.BehaviouralPattern.MediatorPattern;

public interface Colleague {
    Mediator mediator = null;
    String getName();
    void sendTo(String to, String message);
    void sendAll(String message);
    void receive(String from, String message);
}
