package org.example.Correction.Exo3;

public class FileLogger implements Observer{


    @Override
    public void onNotify(String event) {
        System.out.println("Enregistrement dans un fichier de log de :" +event);
    }
}
