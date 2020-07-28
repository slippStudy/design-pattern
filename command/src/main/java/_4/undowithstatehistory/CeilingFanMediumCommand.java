package _4.undowithstatehistory;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.medium();
        System.out.println("실행시 Fan 의 속도는 ?" + ceilingFan.speed);

    }

}
