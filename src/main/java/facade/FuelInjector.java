package facade;

public class FuelInjector {
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        System.out.println("Fuel Injector in ready");
    }

    public void inject() {
        System.out.println("Fuel injected");
    }

    public void off() {
        System.out.println("Off Fuel Injector");
    }
}
