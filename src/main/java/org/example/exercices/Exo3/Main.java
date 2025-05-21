package org.example.exercices.Exo3;


import org.example.exercices.Exo3.observer.EventManager;
import org.example.exercices.Exo3.observer.MyObserver;
import org.example.exercices.Exo3.observer.Observer;

public class Main {
    public static void main(String[] args) {

        EventManager event = new EventManager();

        Observer observer1 = new MyObserver("Utilisateur1");
        Observer observer2 = new MyObserver("Utilisateur2");

        event.addObserver(observer1);
        event.addObserver(observer2);
        event.notifyObserver("L'Event 1 est arrivée!!!");
        event.addEventObserver("Event 1");

    }

}
