package main.model.observe.interfaces;

/**
 * Created by joaok on 27/04/2017.
 */
public interface ISubject {

    public int registerObserver(IObserver observer);

    public int removeObserver(IObserver observer);

    public int notifyObservers();

    public int setState(int dataParam);

    public int getState();

}
