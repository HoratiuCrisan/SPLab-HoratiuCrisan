package ro.uvt.info.splab;

public class Image implements Element{
    private String url;
    private Section parent;
    public Image(String url) {this.url = url;}

    @Override
    public void setParent(Section parent) {
        this.parent = parent;
    }

    @Override
    public Section getParent() {
        return parent;
    }
    @Override
    public void print() {
        System.out.println(this.url + "\n");
    }

    @Override
    public void add(Element element) {
        System.out.println("Cannot add elements to a leaf node!");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Cannot remove elements from a leaf node!");
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
