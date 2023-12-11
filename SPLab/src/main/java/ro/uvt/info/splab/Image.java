package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.concurrent.TimeUnit;
@Setter
@Getter

public class Image implements Element, Picture{
    private String content;
    private String url;
    private Element parent;
    private Dimension dim;

    public Image (String content, String url, Dimension dim) {
        this.content = content;
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public String content() {
        return this.content;
    }
    @Override
    public void print() {
        System.out.println("Image with name: " + this.url + "\n" + "Content: " + this.content);
    }
}