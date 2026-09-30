package com.erwan.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public final class facteursPremiers {

    private facteursPremiers() {
        // Classe utilitaire : pas d'instanciation
    }

    public static List<Integer> generate(int nombre) {
        List<Integer> facteurs = new ArrayList<>();
        if (nombre > 1) {
            facteurs.add(nombre);
        }
        return facteurs;
    }
}