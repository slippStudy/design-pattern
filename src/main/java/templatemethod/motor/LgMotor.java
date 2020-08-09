package templatemethod.motor;

public class LgMotor extends Motor {
    public LgMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Move LG Motor");
    }
}
