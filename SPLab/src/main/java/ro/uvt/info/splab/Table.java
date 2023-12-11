package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

public class Table implements Element{
    @Getter
    @Setter
    private String title;
    private Element parent;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) throws Exception {
        throw new Exception("You cannot add an element to a node element!");
    }

    @Override
    public void remove(Element element) throws Exception {
        throw new Exception("You cannot remove an element from a leaf node!");
    }

    @Override
    public Element get(int index) throws Exception {
        throw new Exception("You cannot extract an element from a leaf node!");
    }

    @Override
    public void setParent(Element parent) {
        this.parent = parent;
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public void print() {
        System.out.println("Table: " + this.title);
    }
}