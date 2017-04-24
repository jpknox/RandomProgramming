package main.model.observe.implementation;

import main.model.observe.interfaces.Observable;
import main.model.observe.interfaces.Subscribable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joaok on 24/04/2017.
 */
public class Subject implements Subscribable {

    private ArrayList<Observable> observers;

    public Subject() {
        observers = new ArrayList<Observable>();
    }

    @Override
    public int subscribe(Observable observer) {
        observers.add(observer);
        return 0;
    }

    @Override
    public int unsubscribe(Observable observer) {
        observers.remove(observer);
        return 0;
    }

    @Override
    public int notifyObservers() {
        for (Iterator<Observable> observerIterator = observers.iterator(); observerIterator.hasNext();) {
            Observable observer = observerIterator.next();
            observer.update();
        }
        return 0;
    }
}
