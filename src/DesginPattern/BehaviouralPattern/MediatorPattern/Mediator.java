package DesginPattern.BehaviouralPattern.MediatorPattern;

public interface Mediator {
    void sendAll(Colleague from, String message);
    void sendTo(Colleague from, String to, String message);
    void register(Colleague user);
}
