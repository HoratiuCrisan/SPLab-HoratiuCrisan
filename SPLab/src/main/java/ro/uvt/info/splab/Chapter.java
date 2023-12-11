package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

public class Chapter {
    @Getter
    @Setter
    private String name;

    Collection<SubChapter> subChapterList = new ArrayList<>();
    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapter) {
        this.subChapterList.add(new SubChapter(subChapter));

        return this.subChapterList.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        int i = 0;
        while (this.subChapterList.iterator().hasNext()) {
            if (i == index)
                return this.subChapterList.iterator().next();
            this.subChapterList.iterator().next();
        }
        return null;
    }

    public String print() {
        StringBuilder text = new StringBuilder("Chapter: " + this.name + "\n");

        for (SubChapter subChapter : this.subChapterList)
            text.append(subChapter.print()).append("\n");

        return text.toString();
    }
}
