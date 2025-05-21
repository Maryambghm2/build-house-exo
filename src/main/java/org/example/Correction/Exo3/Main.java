//package org.example.Correction.Exo3;
//
//public class Main {
//    public static void main(String[] args) {
//        EventManager eventManager = new EventManager();
//
//        eventManager.addObserver(new ConsoleLogger());
//        eventManager.addObserver(new FileLogger());
//        eventManager.addObserver(new MailObserver());
//
//        Observer observer1 = new MailObserver();
//        Observer observer2 = new ConsoleLogger();
//        Observer observer3 = new FileLogger();
//
//        eventManager.notifyObserver(observer1);
//    }
//}
