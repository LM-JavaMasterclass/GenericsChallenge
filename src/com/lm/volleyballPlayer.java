package com.lm;

public class volleyballPlayer extends Player {

    public volleyballPlayer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " (Volleyball)" ;
    }
}
