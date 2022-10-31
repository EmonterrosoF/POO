package com.devices;

public abstract class SmartDevice {
    private String bluetooth;
    private String hora;

    SmartDevice() {

    }

    SmartDevice(String bluetooth, String hora) {
        this.bluetooth = bluetooth;
        this.hora = hora;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getHora() {
        return hora;
    }

}
