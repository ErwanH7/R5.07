package com.erwan.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        orientation = Orientation.values()[fois % 4];
        return orientation;
    }
}