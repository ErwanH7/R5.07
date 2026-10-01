package com.erwan.chiffresRomains;

public class ArabicRomanNumerals {

    private ArabicRomanNumerals() {
        // Classe utilitaire : pas d'instanciation
    }

    public static String convert(int nbr) {
        StringBuilder romain = new StringBuilder();
        int reste = nbr;
        if (reste >= 10) {
            romain.append("X");
            reste -= 10;
        }
        if (reste >= 9) {
            romain.append("IX");
            reste -= 9;
        }
        if (reste >= 5) {
            romain.append("V");
            reste -= 5;
        }
        if (reste >= 4) {
            romain.append("IV");
            reste -= 4;
        }
        while (reste >= 1) {
            romain.append("I");
            reste -= 1;
        }
        return romain.toString();
    }
}
