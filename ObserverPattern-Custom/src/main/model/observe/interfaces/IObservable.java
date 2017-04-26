package main.model.observe.interfaces;

/**
 * Created by joaok on 24/04/2017.
 */
public interface IObservable {

    public int subscribe(IObserver observer);

    public int unsubscribe(IObserver observer);

    public int notifyObservers();

}
