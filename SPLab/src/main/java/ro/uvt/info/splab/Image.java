package ro.uvt.info.splab;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String url;
    private Dimension dim;
    private Picture content;
    private Section parent;
    private ImageLoader imageLoader;

    public Image(String url) {
        this.url = url;
        this.imageLoader = new JPGImageLoader();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = new ImageProxy(url);
    }

    public void setImageLoader(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
    }

    public ImageLoader getImageLoader() {
        return this.imageLoader;
    }

    @Override
    public void setParent(Section parent) {
        this.parent = parent;
    }

    @Override
    public Dimension dim() {
        return this.dim;
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

    @Override
    public String url() {
        return this.url;
    }
}
