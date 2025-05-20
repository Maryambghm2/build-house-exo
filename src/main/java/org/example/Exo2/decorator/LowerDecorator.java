package org.example.Exo2.decorator;

public class LowerDecorator extends TextDecorator {
    public LowerDecorator(Text text) {
        super(text);
    }
    public String transform() {
        return super.transform().toLowerCase()+ " , en minuscule.";
    }
}
