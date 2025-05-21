package org.example.exercices.Exo2.decorator;

public class PlainText implements Text {

    @Override
    public String transform(String input) {
        return input;
    }
}
