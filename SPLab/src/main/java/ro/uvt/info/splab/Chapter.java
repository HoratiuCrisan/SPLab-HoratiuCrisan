package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;

public class Chapter {

    private String name;
    private Collection<SubChapter> subChapters = new ArrayList<SubChapter>();

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

    public String print() {
        String text = "\nChapter: " + name;
        for (SubChapter subChapter : subChapters)
            text += subChapter.print();

        return text;
    }
}
