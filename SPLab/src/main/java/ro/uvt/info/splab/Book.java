package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;

public class Book implements TableOfConens{
    private String title;
    private Collection<Author> authorList = new ArrayList<Author>();

    public Book(String title, ArrayList<Author> authorList) {
        this.title = title;
        this.authorList = authorList;
    }

    @Override
    public String print() {
        String authors = "";
        for (Author aut : authorList) {
            authors += aut.GetAuthor();
        }

        return title + ": Authors: " + authors;
    }
}
