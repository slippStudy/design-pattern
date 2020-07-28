package _4.undowithstatehistory;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.low();
        System.out.println("실행시 Fan 의 속도는 ?" + ceilingFan.speed);

    }
}
