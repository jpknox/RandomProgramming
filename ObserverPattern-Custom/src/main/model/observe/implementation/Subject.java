package main.model.observe.implementation;

import main.model.observe.interfaces.IObserver;
import main.model.observe.interfaces.IObservable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joaok on 24/04/2017.
 */
public class Subject implements IObservable {

    private ArrayList<IObserver> observers;

    public Subject() {
        observers = new ArrayList<IObserver>();
    }

    @Override
    public int subscribe(IObserver observer) {
        observers.add(observer);
        return 0;
    }

    @Override
    public int unsubscribe(IObserver observer) {
        observers.remove(observer);
        return 0;
    }

    @Override
    public int notifyObservers() {
        for (Iterator<IObserver> observerIterator = observers.iterator(); observerIterator.hasNext();) {
            IObserver observer = observerIterator.next();
            observer.update();
        }
        return 0;
    }
}
