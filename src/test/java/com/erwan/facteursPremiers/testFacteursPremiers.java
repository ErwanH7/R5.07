package com.erwan.facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FacteursPremiersTest {

    @Test
    void generate_de_1_devrait_retourner_une_liste_vide() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(1);

        // THEN
        assertThat(facteurs).isEmpty();
    }

    @Test
    void generate_de_2_devrait_retourner_2() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(2);

        // THEN
        assertThat(facteurs).containsExactly(2);
    }
}