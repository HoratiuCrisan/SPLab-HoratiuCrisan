package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

public class Book implements TableOfContents{
    @Getter
    @Setter
    private String title;
    private Collection<Author> authorList = new ArrayList<>();

    Collection<Chapter> chapterList = new ArrayList<>();

    public Book(String title) {
        this.title = title;
        this.authorList = new ArrayList<>();
    }

    public int createChapter(String chapter) {
        this.chapterList.add(new Chapter(chapter));
        return this.chapterList.size() - 1;
    }

    public Chapter getChapter(int index) {
        int i = 0;
        while (this.chapterList.iterator().hasNext()) {
            if (i == index)
                return this.chapterList.iterator().next();
            this.chapterList.iterator().next();
            i++;
        }
        return null;
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    @Override
    public String print() {
        StringBuilder text = new StringBuilder("Book: " + this.title + "\n");
        for (Author author : this.authorList)
            text.append(author.print()).append("\n");
        for (Chapter chapter: this.chapterList)
            text.append(chapter.print()).append("\n");

        return text.toString();
    }
}
