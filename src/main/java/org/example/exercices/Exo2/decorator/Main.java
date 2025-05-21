package org.example.exercices.Exo2.decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Text baseText = new PlainText();
//        System.out.println("""
//
//             """);

        baseText = new PrefixDecorator(baseText, ">> -");
        System.out.println(baseText.transform("Hi gUys"));
    }
}
