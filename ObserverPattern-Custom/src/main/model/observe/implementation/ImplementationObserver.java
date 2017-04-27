package main.model.observe.implementation;

import main.model.observe.interfaces.IObserver;
import main.model.observe.interfaces.ISubject;

/**
 * Created by joaok on 27/04/2017.
 */
public class ImplementationObserver implements IObserver {

    private ISubject subject;
    private String name;
    private int data;

    public ImplementationObserver(ImplementationSubject implementationSubject, String nameParam) {
        this.subject = implementationSubject;
        this.name = nameParam;
        this.subject.registerObserver(this);
    }

    public ImplementationObserver(String nameParam) {
        this.name = nameParam;
    }

    @Override
    public int update(int dataParam) {
        this.data = dataParam;
        System.out.printf("Hi I'm %s, and my new data is %d\n", name, data);
        return 0;
    }

    public int setSubject(ISubject subjectParam) {
        this.subject = subjectParam;
        return 0;
    }
}
