package observer;

public class ConcreteObserverA implements Observer<String> {
    public void observe(String event) {
        System.out.println("Observer A :" + event);
    }
}
