package com.erwan.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public final class facteursPremiers {

    private facteursPremiers() {
        // Classe utilitaire : pas d'instanciation
    }

    /**
     * Décompose un entier en produit de facteurs premiers.
     *
     * @param nombre l'entier à décomposer (> 0)
     * @return la liste croissante des facteurs premiers de nombre,
     *         vide si nombre vaut 1
     */
    public static List<Integer> generate(int nombre) {
        List<Integer> facteurs = new ArrayList<>();
        int reste = nombre;
        int diviseur = 2;
        while (reste > 1) {
            while (reste % diviseur == 0) {
                facteurs.add(diviseur);
                reste = reste / diviseur;
            }
            diviseur++;
        }
        return facteurs;
    }
}