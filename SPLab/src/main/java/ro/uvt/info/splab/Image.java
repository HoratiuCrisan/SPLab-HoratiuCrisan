package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

public class Image implements Element{
    @Getter
    @Setter
    private String imageName;
    private Element parent;

    public Image (String imageName) {
        this.imageName = imageName;
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
        System.out.println("Image with name: " + this.imageName);
    }
}
