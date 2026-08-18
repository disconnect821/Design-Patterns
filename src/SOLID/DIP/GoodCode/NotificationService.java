package SOLID.DIP.GoodCode;

public class NotificationService {
    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel){
        this.notificationChannel = notificationChannel;
    }

    public void notify(String message){
        notificationChannel.sendNotification(message);
    }
}
