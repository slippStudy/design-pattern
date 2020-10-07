package observer;

public class Client {
    public static void main(String[] args) {
        Subject<String> subject = new ConcreteSubject();
        Observer<String> observerA = new ConcreteObserverA();
        Observer<String> observerB = new ConcreteObserverB();

        subject.notifyObservers("No Listeners");

        subject.registerObserver(observerA);
        subject.notifyObservers("Message for A");

        subject.registerObserver(observerB);
        subject.notifyObservers("Message for A & B");
    }
}
