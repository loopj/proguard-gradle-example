package com.loopj.example;

public class Crash {
    public Crash() {

    }

    public void crash() {
        throw new RuntimeException("Something broke");
    }
}
