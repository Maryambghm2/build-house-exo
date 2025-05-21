package org.example.exercices.Exo2.decorator;

public class UpperDecorator extends TextDecorator {
    public UpperDecorator(Text text) {
        super(text);
    }

    public String transform(String input) {
        return super.transform(input).toUpperCase()+ ", en majuscule.";
    }
}
