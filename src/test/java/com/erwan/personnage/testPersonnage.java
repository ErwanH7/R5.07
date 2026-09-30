package com.erwan.personnage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonnageTest {

    private Personnage personnage;

    @BeforeEach
    void setUp() {
        personnage = new Personnage();
    }

    @Test
    void nouveau_personnage_devrait_etre_oriente_nord() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.getOrientation();

        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_1_fois_depuis_nord_devrait_retourner_est() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(1);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.EST);
    }

    @Test
    void tourner_2_fois_depuis_nord_devrait_retourner_sud() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(2);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.SUD);
    }

    @Test
    void tourner_3_fois_depuis_nord_devrait_retourner_ouest() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(3);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.OUEST);
    }

    @Test
    void tourner_4_fois_depuis_nord_devrait_revenir_au_nord() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(4);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_5_fois_depuis_nord_devrait_retourner_est() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(5);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.EST);
    }

    @Test
    void tourner_0_fois_devrait_garder_l_orientation_nord() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(0);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_1_fois_puis_1_fois_devrait_retourner_sud() {
        // GIVEN
        personnage.tourner(1);

        // WHEN
        Orientation orientation = personnage.tourner(1);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.SUD);
    }

    @Test
    void tourner_moins_1_fois_depuis_nord_devrait_retourner_ouest() {
        // GIVEN

        // WHEN
        Orientation orientation = personnage.tourner(-1);

        // THEN
        assertThat(orientation).isEqualTo(Orientation.OUEST);
    }
}