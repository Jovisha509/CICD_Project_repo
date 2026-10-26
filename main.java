
package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("      IoT Device Dashboard");
        System.out.println("================================");

        String deviceName = "IoT Sensor 01";
        String deviceStatus = "ONLINE";
        double temperature = 28.5;
        int batteryLevel = 85;

        System.out.println("Device Name : " + deviceName);
        System.out.println("Status      : " + deviceStatus);
        System.out.println("Temperature : " + temperature + " C");
        System.out.println("Battery     : " + batteryLevel + "%");

        if (temperature > 35.0) {
            System.out.println("Alert: High temperature detected!");
        } else {
            System.out.println("Temperature is normal.");
        }

        System.out.println("================================");
        System.out.println("Application executed successfully!");
    }
}
