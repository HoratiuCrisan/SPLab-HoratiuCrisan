package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Chapter {

    private String name;
    private Collection<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public Chapter(String name, Collection<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return  this.name;
    }
    public Collection<SubChapter> GetSubChapters() {
        return this.subChapters;
    }

    public void setSubChapters(Collection<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public int CreateSubChapter(String subChapter) {
        subChapters.add(new SubChapter(subChapter));

        return this.subChapters.size() - 1;
    }

    public SubChapter GetSubChapter(int index) {
        SubChapter currentSubchapter = new SubChapter("Null");
        Iterator<SubChapter> iterator = this.subChapters.iterator();

        for (int i = 0; i <= index && iterator.hasNext(); i++)
            currentSubchapter = iterator.next();

        return currentSubchapter;
    }

    public String print() {
        String text = "\nChapter: " + name;
        for (SubChapter subChapter : subChapters)
            text += subChapter.print();

        return text;
    }
}
