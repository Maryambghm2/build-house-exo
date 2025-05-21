package org.example.Correction.Exo3;

public class MailObserver implements Observer{

    @Override
    public void onNotify(String event) {
        System.out.println("Envoi un mail car il y'a eu un nouvel event! "+event);
    }
}
