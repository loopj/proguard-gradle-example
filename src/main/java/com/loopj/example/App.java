package com.loopj.example;

public class App {
    public static void main(String [ ] args) {
        System.out.println("Hello world");

        Crash crash = new Crash();
        crash.crash();

        System.out.println("Goodbye world");
    }
}
