package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Book implements TableOfConens{
    private String title;
    private Collection<Author> authorList = new ArrayList<Author>();

    private Collection<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, ArrayList<Author> authorList) {
        this.title = title;
        this.authorList = authorList;
    }

    public String GetTitle() {
        return this.title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public void SetChapters(Collection<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Collection<Chapter> GetChapters() {
        return this.chapters;
    }

    public void AddAuthor(Author author) {
        authorList.add(author);
    }

    public int CreateChapter(String chapter) {
        this.chapters.add(new Chapter(chapter));

        return this.chapters.size() - 1;
    }

    public Chapter GetChapter(int index) {
        Chapter currentChapter = new Chapter("Null");
        Iterator<Chapter> iterator = this.chapters.iterator();
        for (int i = 0; i <= index && iterator.hasNext(); i++)
            currentChapter = iterator.next();

        return currentChapter;
    }

    @Override
    public String print() {
        String authors = "";
        for (Author aut : authorList) {
            authors += aut.print();
        }

        String chapt = "";
        for (Chapter chapter : chapters) {
            chapt += chapter.print();
        }

        return "\nTitle: " + title
                + "\nAuthors: \n" + authors
                + "\nChapters: \n" + chapt;
    }
}
