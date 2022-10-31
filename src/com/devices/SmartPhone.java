package com.devices;

public class SmartPhone extends SmartDevice {
    
    private String wifi;

    SmartPhone(){

    }

    SmartPhone(String bluetooth, String hora, String wifi){
        super(bluetooth, hora);
        this.wifi = wifi;
    }   

    public String getWifi() {
        return wifi;
    }


}
