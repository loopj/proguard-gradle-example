package com.loopj.example;

class Crash {
    public Crash() {

    }

    private void crash() {
        throw new RuntimeException("Something broke");
    }

    private void parentOfCrash() {
        crash();
    }

    public void grandparentOfCrash() {
        parentOfCrash();
    }
}
