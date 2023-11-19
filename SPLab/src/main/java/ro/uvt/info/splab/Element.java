package ro.uvt.info.splab;

public interface Element {
    public void print();
    public void add(Element element);
    public void remove(Element element);
    public Element get(int index);

    void setParent(Section parent);
    Section getParent();
}
