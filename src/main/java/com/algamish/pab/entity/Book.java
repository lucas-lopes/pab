package com.algamish.pab.entity;

import com.algamish.pab.entity.enums.BibleVersion;
import com.algamish.pab.entity.enums.Testament;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Book {

    private String name;
    private String initials;
    private BibleVersion version;
    private Testament testament;
    private Integer chapterNumbers;
    private List<Chapter> chapters;


}
