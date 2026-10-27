
public class Main {
    public static void main(String[] args) {

        String deviceName = "Temperature Sensor";
        double temperature = 28.5;
        int battery = 85;

        System.out.println("===== IoT Application =====");
        System.out.println("Device: " + deviceName);
        System.out.println("Temperature: " + temperature + " C");
        System.out.println("Battery: " + battery + "%");

        if (temperature > 35.0) {
            System.out.println("WARNING: High temperature!");
        } else {
            System.out.println("Temperature is normal.");
        }

        System.out.println("Application completed successfully!");
    }
}
