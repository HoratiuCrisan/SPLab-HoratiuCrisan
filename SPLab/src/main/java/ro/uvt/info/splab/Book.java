package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Book extends Section {
    private String title;
    private ArrayList<Element> bookElements = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title) {
        super("");
        this.title = title;
        this.authors = new ArrayList<>();
    }
    public Book(String title, String text) {
        super(text);
        this.title = title;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void removeAuthor(Author author) {
        this.authors.remove(author);
    }

    public void print() {
        System.out.println(this.title);
        System.out.println("Authors: ");
        for (Author author : this.authors)
            author.print();

        System.out.println("Sections: ");
        for (Element section : this.bookElements)
            section.print();
    }


    public void addContent(Element element) {
        if (element.getParent() != null)
            throw new IllegalArgumentException("Element already has a parent!");
        this.bookElements.add(element);
        element.setParent(this);
    }


    public void remove(Element element) {
        if (!this.bookElements.contains(element))
            System.out.println("Book does not contain that element!");
        else
            this.bookElements.remove(element);
    }


    public Element get(int index) {
        if (index >= 0 && index < this.bookElements.size())
            return this.bookElements.get(index);
        return null;
    }
}
