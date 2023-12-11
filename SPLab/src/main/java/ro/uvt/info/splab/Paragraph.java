package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

public class Paragraph implements Element{
    @Getter
    @Setter
    private String text;
    private Element parent;

    public Paragraph(String text) {
        this.text = text;
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
        System.out.println("Paragraph: " + this.text);
    }
}