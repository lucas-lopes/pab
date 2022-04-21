package com.algamish.pab.entity;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Chapter {

    private Integer number;
    private Integer verseNumbers;
    private List<Verse> verses;

}
