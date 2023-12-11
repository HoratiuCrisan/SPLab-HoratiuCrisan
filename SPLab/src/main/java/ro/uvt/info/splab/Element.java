package ro.uvt.info.splab;

import java.io.IOException;

public interface Element {
    public void print() throws IOException;
    public void add(Element element) throws Exception;
    public void remove(Element element) throws Exception;
    public Element get(int index) throws Exception;
    public void setParent(Element parent);
    public Element getParent();
}