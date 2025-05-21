package org.example.demos.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new MyObserver("observer1");
        Observer observer2 = new MyObserver("observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver("Un nouvel article vient d'arriver !!!");
        subject.notifyObserver("Encore un nouvel article qui arrive!!!");

        subject.removeObserver(observer2);

        subject.notifyObserver("Une derniere actu!!!");



    }
}
