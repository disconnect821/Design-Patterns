package DesginPattern.BehaviouralPattern.observerPattern;

public class WeatherCheckMain {
    public static void main(String[] args) {

        WeatherSubject weatherSubject = new WeatherSubject();

        Device mobileDevice = new MobileDevice();
        Device computerDevice = new ComputerDevice();

        weatherSubject.attachDevices(mobileDevice);
        weatherSubject.attachDevices(computerDevice);

        weatherSubject.setTemperature(22.5f);

        weatherSubject.detachDevice(mobileDevice);

        weatherSubject.setTemperature(10.f);
    }
}
