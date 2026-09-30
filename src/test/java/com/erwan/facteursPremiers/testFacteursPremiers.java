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

    @Test
    void generate_de_3_devrait_retourner_3() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(3);

        // THEN
        assertThat(facteurs).containsExactly(3);
    }

    @Test
    void generate_de_4_devrait_retourner_2_2() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(4);

        // THEN
        assertThat(facteurs).containsExactly(2, 2);
    }

    @Test
    void generate_de_6_devrait_retourner_2_3() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(6);

        // THEN
        assertThat(facteurs).containsExactly(2, 3);
    }

    @Test
    void generate_de_8_devrait_retourner_2_2_2() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(8);

        // THEN
        assertThat(facteurs).containsExactly(2, 2, 2);
    }

    @Test
    void generate_de_9_devrait_retourner_3_3() {
        // GIVEN
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(9);

        // THEN
        assertThat(facteurs).containsExactly(3, 3);
    }

    @Test
    void generate_de_180180_devrait_retourner_tous_ses_facteurs_premiers() {
        // WHEN
        List<Integer> facteurs = facteursPremiers.generate(180180);

        // THEN
        assertThat(facteurs).containsExactly(2, 2, 3, 3, 5, 7, 11, 13);
    }
}