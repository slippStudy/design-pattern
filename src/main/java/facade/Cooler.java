package facade;

public class Cooler {
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void run() {
        System.out.println("Air Conditioner in ready");
        radiator.setSpeed(10);
    }

    public void cool(int maxAllowedTemperature) {
        System.out.println("Cooling maximum : " + maxAllowedTemperature);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        System.out.println("Air Conditioner stop");
        radiator.off();
    }
}
