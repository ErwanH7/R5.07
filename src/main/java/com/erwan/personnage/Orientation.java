package com.erwan.personnage;

/**
 * Les quatre orientations possibles, dans le sens des aiguilles d'une montre.
 */
public enum Orientation {
    NORD, EST, SUD, OUEST;

    /**
     * Calcule l'orientation obtenue après un certain nombre de quarts de tour.
     *
     * @param quartsDeTour nombre de quarts de tour dans le sens horaire
     * @return la nouvelle orientation
     */
    public Orientation apresQuartsDeTour(int quartsDeTour) {
        Orientation[] orientations = values();
        return orientations[(ordinal() + quartsDeTour) % orientations.length];
    }
}