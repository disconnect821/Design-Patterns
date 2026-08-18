package SOLID.DIP.GoodCode;

public class SmsService implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS" + message);
    }
}
