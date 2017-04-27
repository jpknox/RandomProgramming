package main.model.observe.implementation;

import main.model.observe.interfaces.AObservable;
import main.model.observe.interfaces.AObserver;

/**
 * Created by joaok on 24/04/2017.
 */
public class AConcreteObserver extends AObserver {

    public AConcreteObserver(String name, AObservable subject) {
        super(name, subject);
    }
}
