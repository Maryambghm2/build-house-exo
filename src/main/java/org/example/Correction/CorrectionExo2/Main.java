package org.example.Correction.CorrectionExo2;

import org.example.exercices.Exo2.decorator.PlainText;
import org.example.exercices.Exo2.decorator.PrefixDecorator;
import org.example.exercices.Exo2.decorator.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Text baseText = new PlainText();
//        System.out.println("""
//
//             """);

        // ajout d'un prefix
        baseText = new PrefixDecorator(baseText, ">>> - ");
        System.out.println(baseText);

    }
}
