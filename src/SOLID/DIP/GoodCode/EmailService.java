package SOLID.DIP.GoodCode;

public class EmailService implements NotificationChannel {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email" + message );
    }
}
