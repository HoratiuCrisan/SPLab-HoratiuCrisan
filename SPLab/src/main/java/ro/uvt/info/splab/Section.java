package ro.uvt.info.splab;


import java.util.ArrayList;

public class Section implements Element{
    private String text;
    private Section parent;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public Section(String text) {
        this.text = text;
    }

    @Override
    public void setParent(Section parent) {
        this.parent = parent;
    }

    @Override
    public Section getParent() {
        return this.parent;
    }

    @Override
    public void print() {
        System.out.println(this.text);
        for (Element element : this.elements)
            element.print();
    }

    @Override
    public void add(Element element) {
        if (element.getParent() != null)
            throw new IllegalArgumentException("Element already has a parent!");
        this.elements.add(element);
        element.setParent(this);
    }

    @Override
    public void remove(Element element) {
        if (!this.elements.contains(element)) {
            System.out.println("Element is not inside the lise!");
        } else {
            this.elements.remove(element);
            element.setParent(null);
        }
    }

    @Override
    public Element get(int index) {
        if (index >=  0 && index <= this.elements.size())
            return this.elements.get(index);
        return null;
    }
}
