package com.erwan.chiffresRomains;

import com.erwan.facteursPremiers.facteursPremiers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ArabicRomanNumeralsTest {

    @Test
    void generate_de_1_devrait_retournerI() {
        // GIVEN
        int nombre = 1;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("I");
    }

    @Test
    void convert_2_devrait_retourner_II() {
        // GIVEN
        int nombre = 2;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("II");
    }

    @Test
    void convert_3_devrait_retourner_III() {
        // GIVEN
        int nombre = 3;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("III");
    }

    @Test
    void convert_4_devrait_retourner_IV() {
        // GIVEN
        int nombre = 4;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("IV");
    }

    @Test
    void convert_5_devrait_retourner_V() {
        // GIVEN
        int nombre = 5;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("V");
    }

    @Test
    void convert_6_devrait_retourner_VI() {
        // GIVEN
        int nombre = 6;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("VI");
    }

    @Test
    void convert_9_devrait_retourner_IX() {
        // GIVEN
        int nombre = 9;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("IX");
    }

    @Test
    void convert_10_devrait_retourner_X() {
        // GIVEN
        int nombre = 10;

        // WHEN
        String romain = ArabicRomanNumerals.convert(nombre);

        // THEN
        assertThat(romain).isEqualTo("X");
    }
}