package facade;

public class CarEngineFacade {
    private Cooler cooler = new Cooler();
    private AirCirculator airCirculator = new AirCirculator();
    private FuelInjector fuelInjector = new FuelInjector();
    private static final int DEFAULT_MAX_TEMPERATURE = 25;

    public void startEngine() {
        airCirculator.takeAir();
        fuelInjector.on();
        cooler.run();
        cooler.cool(DEFAULT_MAX_TEMPERATURE);
        fuelInjector.inject();
    }

    public void endEngine() {
        airCirculator.off();
        fuelInjector.off();
        cooler.stop();
    }
}
