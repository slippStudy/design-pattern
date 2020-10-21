package adapter;

public class UsRoboticsModem implements Modem {
    @Override
    public void dial(char[] a) {
        System.out.println("US Robotics dial");
    }

    @Override
    public void hangup() {
        System.out.println("US Robotics hangup");
    }

    @Override
    public void send() {
        System.out.println("US Robotics send");
    }

    @Override
    public void receive() {
        System.out.println("US Robotics receive");
    }
}
