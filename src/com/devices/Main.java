package com.devices;

public class Main {
    public static void main(String[] args) throws Exception {
        
        SmartPhone samsung = new SmartPhone("bluetooth desde smartPhone", "hora desde smartPhone", "wifi desde smartPhone");
        System.out.println(samsung.getBluetooth() + " " + samsung.getHora() + " " + samsung.getWifi());

        SmartWatch watch = new SmartWatch("bluetooth desde smartWatch", "hora desde smartWatch", "medidor desde smartWatch");
        System.out.println(watch.getBluetooth() + " " + watch.getHora() + " " + watch.getMedidor());

            
        };

    }
    

