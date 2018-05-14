package com.lm;

public class soccerPlayer extends Player {

    public soccerPlayer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " (Soccer)" ;
    }
}
