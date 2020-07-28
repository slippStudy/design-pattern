package _4.undowithstatehistory;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.off();
        System.out.println("실행시 Fan 의 속도는 ?" + ceilingFan.speed);

    }
}
