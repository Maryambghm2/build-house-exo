package org.example.exercices.Exo3.observer;

import org.example.demos.behavioral.observer.MyObserver;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addEventObserver(String event) {
        for (Observer observer : observers) {
            observer.addFile(event);
        }
    }

}

