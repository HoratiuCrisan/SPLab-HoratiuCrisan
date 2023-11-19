package ro.uvt.info.splab;

public class Paragraph implements Element{
    private String text;
    private Section parent;
    public Paragraph(String text) {
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
    }

    @Override
    public void add(Element element) {
        System.out.println("Cannot add to a leaf node.");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Cannot remove from a leaf node.");
    }

    @Override
    public Element get(int index) {
        return null;
    }

}