package DesginPattern.BehaviouralPattern.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        Mediator chatMediator = new ChatMediator();
        User user1 = new User("Aditya", chatMediator);
        User user2 = new User("Aman", chatMediator);
        User user3 = new User("GV", chatMediator);

        user1.sendTo("Aman", "hello");
        user1.sendAll( "Wssup");
    }
}
