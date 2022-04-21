package com.algamish.pab.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VerseTest {

    @Test
    void testCreateVerseEntity() {
        Verse verse = Verse.builder()
            .number(1)
            .text("Paulo, servo de Deus e apóstolo de Jesus Cristo")
            .build();

        assertThat(verse.getNumber()).isEqualTo(1);
        assertThat(verse.getText()).isEqualTo("Paulo, servo de Deus e apóstolo de Jesus Cristo");
    }

}
