package ro.uvt.info.splab;

import java.awt.*;

public class ImageProxy implements Element, Picture{
    private String url;
    private Image realImage;
    private Section parent;
    private Dimension dim;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
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
    public Dimension dim() {
        throw new UnsupportedOperationException("This is not the real image!");
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("This is not the real image!");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("This is not the real image!");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("This is not the real image!");
    }

    @Override
    public String url() {
        throw new UnsupportedOperationException("This is not the real image!");
    }

    public Image loadImage() {
        if (this.realImage == null)
            this.realImage = new Image(url);
        return this.realImage;
    }
}
