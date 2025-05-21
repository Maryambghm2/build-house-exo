package org.example.exercices.Exo3.observer;

public class MyObserver implements Observer {
    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+ " à un reçu un message :"+ message);
    }

    @Override
    public void addFile(String event) {
        System.out.println(name+ " enregistre dans ses fichier l'évènement: "+ event);
    }
}
