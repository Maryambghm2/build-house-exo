package org.example.exercices.Exo2.decorator;

public class PrefixDecorator extends TextDecorator {
    private String prefix;

    public PrefixDecorator(Text text, String prefix) {
        super(text);
        this.prefix = prefix;
    }

    public String transform(String input) {
        return "-" + prefix + super.transform(input);
    }
}
