package org.example.exercices.Exo2.decorator;

public class LowerDecorator extends TextDecorator {
    public LowerDecorator(Text text) {
        super(text);
    }
    public String transform(String input) {
        return super.transform(input).toLowerCase()+ " , en minuscule.";
    }
}
