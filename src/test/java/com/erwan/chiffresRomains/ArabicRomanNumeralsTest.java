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
}