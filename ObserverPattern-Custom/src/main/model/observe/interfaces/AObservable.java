package main.model.observe.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joaok on 24/04/2017.
 */
public abstract class AObservable {

    private ArrayList<AObserver> observers;

    public AObservable() {
        observers = new ArrayList<AObserver>();
    }

    public int subscribe(AObserver observer) {
        if (!observers.contains(observer))
            observers.add(observer);
        return 0;
    }

    public int unsubscribe(AObserver observer) {
        observers.remove(observer);
        return 0;
    }

    public int notifyObservers() {
        for (AObserver observer: observers) {
            observer.update();
        }
        return 0;
    }

}
