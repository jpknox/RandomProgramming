package main.app;

import main.model.observe.implementation.Observer;
import main.model.observe.implementation.Subject;

/**
 * Created by joaok on 24/04/2017.
 */
public class ObserverPatternStarter {


    //This program demonstrates my interpretation of the Observer pattern.
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer0 = new Observer("Jeff", subject);
        Observer observer1 = new Observer("Benjamin", subject);
        Observer observer2 = new Observer("Kyle", subject);

        subject.notifyObservers();
    }

}
