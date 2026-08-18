package SOLID.DIP.GoodCode;

import SOLID.DIP.GoodCode.NotificationService;

public class Operate {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        NotificationService smsNotification = new NotificationService(new SmsService());

        emailNotification.notify("email service");
        smsNotification.notify("sms service");
    }
}
