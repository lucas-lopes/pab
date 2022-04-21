package com.algamish.pab.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.algamish.pab.entity.enums.BibleVersion;
import com.algamish.pab.entity.enums.Testament;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void testCreateBookEntity() {
        Verse verse1cap1 = Verse.builder()
            .number(1)
            .text("Paulo, servo de Deus e apóstolo de Jesus Cristo")
            .build();

        Verse verse2cap1 = Verse.builder()
            .number(2)
            .text("fé e conhecimento que se fundamentam")
            .build();

        Verse verse3cap1 = Verse.builder()
            .number(3)
            .text("No devido tempo, ele trouxe à luz")
            .build();

        Verse verse1cap2 = Verse.builder()
            .number(1)
            .text("Você, porém, fale o que está de acordo com a sã doutrina.")
            .build();

        Chapter chapter1 = Chapter.builder()
            .number(1)
            .verses(new ArrayList<>(Arrays.asList(verse1cap1, verse2cap1, verse3cap1)))
            .build();

        Chapter chapter2 = Chapter.builder()
            .number(2)
            .verses(new ArrayList<>(Collections.singletonList(verse1cap2)))
            .build();

        Book book = Book.builder()
            .name("Tito")
            .initials("Tt")
            .version(BibleVersion.NVI)
            .testament(Testament.NEW)
            .chapterNumbers(2)
            .chapters(new ArrayList<>(Arrays.asList(chapter1, chapter2)))
            .build();

        assertThat(book).isNotNull();
        assertThat(book.getName()).isEqualTo("Tito");
        assertThat(book.getInitials()).isEqualTo("Tt");
        assertThat(book.getVersion())
            .isEqualTo(BibleVersion.NVI)
            .isInstanceOf(BibleVersion.class);
        assertThat(book.getTestament())
            .isEqualTo(Testament.NEW)
            .isNotEqualTo(Testament.OLD)
            .isInstanceOf(Testament.class);
        assertThat(book.getChapterNumbers()).isEqualTo(2);
        assertThat(book.getChapters())
            .hasSize(2)
            .isInstanceOf(ArrayList.class);
    }

}
