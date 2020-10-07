package observer.finish;

import java.util.Iterator;
import java.util.Vector;

public class Subject {
    private Vector itsObservers = new Vector();

    protected void notifyObserver(TimeSource source) {
        Iterator i = itsObservers.iterator();
        while (i.hasNext()) {
            Observer observer = (Observer) i.next();
            observer.update(source);
        }
    }

    public void registerObserver(Observer observer) {
        itsObservers.add(observer);
    }
}
