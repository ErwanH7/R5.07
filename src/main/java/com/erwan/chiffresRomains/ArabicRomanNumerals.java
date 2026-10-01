package com.erwan.chiffresRomains;

/**
 * Conversion de nombres en chiffres arabes vers les chiffres romains.
 */
public final class ArabicRomanNumerals {

    private static final int MIN = 1;
    private static final int MAX = 50;

    private static final int[] VALEURS = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLES = {"L", "XL", "X", "IX", "V", "IV", "I"};

    private ArabicRomanNumerals() {
        // Classe utilitaire : pas d'instanciation
    }

    /**
     * Convertit un entier en chiffres romains.
     *
     * @param nbr l'entier à convertir, compris entre 1 et 50
     * @return l'écriture de nbr en chiffres romains
     * @throws IllegalArgumentException si nbr n'est pas compris entre 1 et 50
     */
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