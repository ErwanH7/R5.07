package com.erwan.chiffresRomains;

public class ArabicRomanNumerals {

    private static final int[] VALEURS = {40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLES = {"XL", "X", "IX", "V", "IV", "I"};

    private ArabicRomanNumerals() {
        // Classe utilitaire : pas d'instanciation
    }

    public static String convert(int nbr) {
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