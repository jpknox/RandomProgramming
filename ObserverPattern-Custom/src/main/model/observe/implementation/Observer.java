package main.model.observe.implementation;

import main.model.observe.interfaces.IObservable;
import main.model.observe.interfaces.IObserver;

/**
 * Created by joaok on 24/04/2017.
 */
public class Observer implements IObserver {

    private String name;
    private IObservable subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    public int update() {
        System.out.println("My name is " + name + ".");
        return 0;
    }
}
