package main.model.observe.implementation;

import main.model.observe.interfaces.IObserver;
import main.model.observe.interfaces.ISubject;

import java.util.ArrayList;

/**
 * Created by joaok on 27/04/2017.
 */
public class ImplementationSubject implements ISubject {

    private ArrayList<IObserver> observers;
    private int data;

    public ImplementationSubject(int dataParam) {
        this.observers = new ArrayList<IObserver>();
        this.data = dataParam;
    }

    @Override
    public int registerObserver(IObserver observer) {
        observers.add(observer);
        return 0;
    }

    @Override
    public int removeObserver(IObserver observer) {
        observers.remove(observer);
        return 0;
    }

    public int notifyObservers() {
        for (IObserver observer: observers) {
            observer.update(this.data);
        }
        return 0;
    }

    @Override
    public int setState(int dataParam) {
        this.data = dataParam;
        notifyObservers();
        return 0;
    }

    @Override
    public int getState() {
        return this.data;
    }
}
