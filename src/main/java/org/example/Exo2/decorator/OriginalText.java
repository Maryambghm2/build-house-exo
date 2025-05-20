package org.example.Exo2.decorator;

public class OriginalText implements Text {

    @Override
    public String transform() {
        return "Voici le texte de base";
    }
}
