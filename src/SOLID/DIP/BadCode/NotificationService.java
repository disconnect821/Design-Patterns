package SOLID.DIP.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SmsService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public void notifyByEmail(){
        emailService.sendEmail();
    }
    public void notifyBySms(){
        smsService.sendSms();
    }
}
