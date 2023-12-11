package ro.uvt.info.splab;

public interface Element {
    public void print();
    public void add(Element element) throws Exception;
    public void remove(Element element) throws Exception;
    public Element get(int index) throws Exception;
    public void setParent(Element parent);
    public Element getParent();
}