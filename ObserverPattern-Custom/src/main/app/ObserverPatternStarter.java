package main.app;

import main.model.observe.implementation.AConcreteObserver;
import main.model.observe.implementation.AConcreteSubject;
import main.model.observe.implementation.ImplementationObserver;
import main.model.observe.implementation.ImplementationSubject;

/**
 * Created by joaok on 24/04/2017.
 */
public class ObserverPatternStarter {


    //This program demonstrates my interpretation and implementation of the Observer pattern.
    public static void main(String[] args) {

        //Observer pattern using Abstract Classes.
        AConcreteSubject concreteSubject = new AConcreteSubject();
        AConcreteObserver concreteObserver0 = new AConcreteObserver("Jeff", concreteSubject);
        AConcreteObserver concreteObserver1 = new AConcreteObserver("Benjamin", concreteSubject);
        AConcreteObserver concreteObserver2 = new AConcreteObserver("Kyle", concreteSubject);
        concreteSubject.notifyObservers();

        //Observer pattern using Interfaces.
        // Interfaces loosely couple the design.
        ImplementationSubject implementationSubject = new ImplementationSubject(1);
        ImplementationObserver implementationObserver0 = new ImplementationObserver(implementationSubject, "Gerald");
        ImplementationObserver implementationObserver1 = new ImplementationObserver(implementationSubject, "Leroy");
        ImplementationObserver implementationObserver2 = new ImplementationObserver(implementationSubject, "Jenkins");
        implementationSubject.notifyObservers();
        // Demonstrates how the data propagates out when setState() is called.
        System.out.println();
        implementationSubject.setState(2);
        System.out.println();
        implementationSubject.setState(3);




    }

}
