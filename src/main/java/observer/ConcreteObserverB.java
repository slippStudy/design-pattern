package observer;

public class ConcreteObserverB implements Observer<String> {
    public void observe(String event) {
        System.out.println("Observer B :" + event);
    }
}
