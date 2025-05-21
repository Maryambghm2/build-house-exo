package org.example.Correction.Exo3;

public class ConsoleLogger implements Observer {

    @Override
    public void onNotify(String event) {
        System.out.println("Nouvel évènement :" + event);
    }
}
