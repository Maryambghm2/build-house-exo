package org.example.Exo2.decorator;

public abstract class OriginalText implements Text {

    @Override
    public String transform() {
        return "Voici le texte de base";
    }
}
