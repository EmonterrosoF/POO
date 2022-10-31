package com.devices;

public class SmartWatch extends SmartDevice {
    private String medidor;

    SmartWatch(String bluetooth, String hora, String medidor){
        super(bluetooth, hora);
        this.medidor = medidor;
    }   

    public String getMedidor() {
        return medidor;
    }
}
