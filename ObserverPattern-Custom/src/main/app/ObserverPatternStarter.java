package main.app;

import main.model.observe.implementation.Observer;
import main.model.observe.implementation.Subject;

/**
 * Created by joaok on 24/04/2017.
 */
public class ObserverPatternStarter {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer0 = new Observer("Jeff");
        Observer observer1 = new Observer("Benjamin");
        Observer observer2 = new Observer("Kyle");

        subject.subscribe(observer0);
        subject.subscribe(observer1);
        subject.subscribe(observer2);

        subject.notifyObservers();
    }

}
