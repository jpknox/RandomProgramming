package main.app;

import main.model.observe.implementation.AConcreteObserver;
import main.model.observe.implementation.AConcreteSubject;
import main.model.observe.implementation.ImplementationObserver;
import main.model.observe.implementation.ImplementationSubject;

/**
 * Created by joaok on 24/04/2017.
 */
public class ObserverPatternStarter {


    //This program demonstrates my interpretation of the AConcreteObserver pattern.
    public static void main(String[] args) {
        AConcreteSubject concreteSubject = new AConcreteSubject();
        AConcreteObserver concreteObserver0 = new AConcreteObserver("Jeff", concreteSubject);
        AConcreteObserver concreteObserver1 = new AConcreteObserver("Benjamin", concreteSubject);
        AConcreteObserver concreteObserver2 = new AConcreteObserver("Kyle", concreteSubject);
        concreteSubject.notifyObservers();

        ImplementationSubject implementationSubject = new ImplementationSubject(1);
        ImplementationObserver implementationObserver0 = new ImplementationObserver(implementationSubject, "Gerald");
        ImplementationObserver implementationObserver1 = new ImplementationObserver(implementationSubject, "Leroy");
        ImplementationObserver implementationObserver2 = new ImplementationObserver(implementationSubject, "Jenkins");
        implementationSubject.notifyObservers();

        System.out.println();
        implementationSubject.setState(2);

        System.out.println();
        implementationSubject.setState(3);




    }

}
