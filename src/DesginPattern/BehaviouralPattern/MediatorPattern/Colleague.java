package DesginPattern.BehaviouralPattern.MediatorPattern;

public interface Colleague {
    String getName();
    void sendTo(String to, String message);
    void sendAll(String message);
    void receive(String from, String message);
}
