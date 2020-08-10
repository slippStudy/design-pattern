package facade;

public class AirCirculator {
    private AirMeter airMeter = new AirMeter();

    public void takeAir() {
        airMeter.getMeasurements();
        System.out.println("Air Circulator take air");
    }

    public void off() {
        System.out.println("Air Circulator off");
    }
}
