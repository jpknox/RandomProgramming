package main.model.observe.interfaces;

/**
 * Created by joaok on 24/04/2017.
 */
public interface Subscribable {

    public int subscribe(Observable observer);

    public int unsubscribe(Observable observer);

    public int notifyObservers();

}
