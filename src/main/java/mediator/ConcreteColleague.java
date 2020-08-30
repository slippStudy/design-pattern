package mediator;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println("Colleague Received : " + message);
    }
}
