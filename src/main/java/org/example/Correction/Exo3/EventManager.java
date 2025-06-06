package org.example.Correction.Exo3;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(String event) {
        for (Observer observer : observers) {
            observer.onNotify(event);
        }
    }

}
