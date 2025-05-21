package org.example.Correction.CorrectionExo2.decorator;

public class SuffixDecorator extends TextDecorator {
    private String suffix;
    public SuffixDecorator(Text text, String prefix) {
        super(text);
        this.suffix = suffix;
    }

    public String transform(){
        return super.transform()+"-"+suffix;
    }
}
