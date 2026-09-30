package com.erwan.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int nouvelIndice = (orientation.ordinal() + fois) % orientations.length;
        orientation = orientations[nouvelIndice];
        return orientation;
    }
}