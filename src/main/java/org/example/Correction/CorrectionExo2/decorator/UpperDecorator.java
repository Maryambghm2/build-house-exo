package org.example.Correction.CorrectionExo2.decorator;

public class UpperDecorator extends TextDecorator {
    public UpperDecorator(Text text) {
        super(text);
    }

    public String transform() {
        return super.transform().toUpperCase()+ ", en majuscule.";
    }
}
