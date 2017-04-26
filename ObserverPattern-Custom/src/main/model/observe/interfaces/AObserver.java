package main.model.observe.interfaces;

/**
 * Created by joaok on 24/04/2017.
 */
public abstract class AObserver {

    private String name;
    private AObservable subject;

    public AObserver(String name, AObservable subject) {
        this.name = name;
        this.subject = subject;
        subject.subscribe(this);
    }

    public int update() {
        System.out.println("My name is: " + name);
        return 0;
    }

}
