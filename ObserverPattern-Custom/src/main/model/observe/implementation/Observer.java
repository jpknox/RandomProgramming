package main.model.observe.implementation;

import main.model.observe.interfaces.Observable;

/**
 * Created by joaok on 24/04/2017.
 */
public class Observer implements Observable {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public int update() {
        System.out.println("My name is " + name + ".");
        return 0;
    }
}
