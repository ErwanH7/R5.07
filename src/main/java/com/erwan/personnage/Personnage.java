package com.erwan.personnage;

/**
 * Personnage du jeu, orienté initialement vers le NORD.
 */
public class Personnage {

    private Orientation orientation = Orientation.NORD;

    /**
     * @return l'orientation actuelle du personnage
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Fait tourner le personnage dans le sens des aiguilles d'une montre.
     *
     * @param fois nombre de quarts de tour
     * @return la nouvelle orientation du personnage
     */
    public Orientation tourner(int fois) {
        orientation = orientation.apresQuartsDeTour(fois);
        return orientation;
    }
}