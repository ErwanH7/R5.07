package com.erwan.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonnageTest {

    @Test
    void nouveau_personnage_devrait_etre_oriente_nord() {
        // GIVEN
        Personnage personnage = new Personnage();

        // WHEN
        Orientation orientation = personnage.getOrientation();

        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }
}