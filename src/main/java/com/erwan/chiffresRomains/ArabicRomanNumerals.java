package com.erwan.chiffresRomains;

public class ArabicRomanNumerals {

    private ArabicRomanNumerals() {
        // Classe utilitaire : pas d'instanciation
    }

    public static String convert(int nbr) {
        StringBuilder romain = new StringBuilder();
        int reste = nbr;
        while (reste >= 1) {
            romain.append("I");
            reste -= 1;
        }
        return romain.toString();
    }
}
