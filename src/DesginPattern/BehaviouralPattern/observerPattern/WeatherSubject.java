package DesginPattern.BehaviouralPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {

    private float temperature = 0f;

    List<Device> devicesList = new ArrayList<>();

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDevices();
    }

    public void attachDevices(Device device){
        devicesList.add(device);
    }

    public void detachDevice(Device device){
        devicesList.removeIf(d -> {
            return d == device;
        });
    }
    public void notifyDevices(){
        for(Device device : devicesList){
            device.setTemp(temperature);
        }
    }
}
