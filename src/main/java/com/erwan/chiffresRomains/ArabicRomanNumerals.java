package com.erwan.chiffresRomains;

public class ArabicRomanNumerals {

    private static final int[] VALEURS = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLES = {"L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int MIN = 1;
    private static final int MAX = 50;

    private ArabicRomanNumerals() {
        // Classe utilitaire : pas d'instanciation
    }

    public static String convert(int nbr) {
        if (nbr < MIN || nbr > MAX) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 50");
        }
        StringBuilder romain = new StringBuilder();
        int reste = nbr;
        for (int i = 0; i < VALEURS.length; i++) {
            while (reste >= VALEURS[i]) {
                romain.append(SYMBOLES[i]);
                reste -= VALEURS[i];
            }
        }
        return romain.toString();
    }
}