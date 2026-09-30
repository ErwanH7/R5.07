package com.erwan.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public final class facteursPremiers {

    private facteursPremiers() {
        // Classe utilitaire : pas d'instanciation
    }

    public static List<Integer> generate(int nombre) {
        List<Integer> facteurs = new ArrayList<>();
        int reste = nombre;
        while (reste % 2 == 0) {
            facteurs.add(2);
            reste = reste / 2;
        }
        if (reste > 1) {
            facteurs.add(reste);
        }
        return facteurs;
    }
}