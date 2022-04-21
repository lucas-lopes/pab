package com.algamish.pab.entity;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ChapterTest {

    @Test
    void testCreateChapterEntity() {
        Verse verse1 = Verse.builder()
            .number(1)
            .text("Paulo, servo de Deus e apóstolo de Jesus Cristo")
            .build();

        Verse verse2 = Verse.builder()
            .number(2)
            .text("fé e conhecimento que se fundamentam")
            .build();

        Verse verse3 = Verse.builder()
            .number(3)
            .text("No devido tempo, ele trouxe à luz")
            .build();

        Chapter chapter = Chapter.builder()
            .number(1)
            .verseNumbers(16)
            .verses(new ArrayList<>(Arrays.asList(verse1, verse2, verse3)))
            .build();

        assertThat(chapter).isNotNull();
        assertThat(chapter.getNumber()).isEqualTo(1);
        assertThat(chapter.getVerseNumbers()).isEqualTo(16);
        assertThat(chapter.getVerses())
            .isNotNull()
            .hasSize(3)
            .isInstanceOf(ArrayList.class);
    }

}
