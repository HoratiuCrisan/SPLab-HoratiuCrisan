package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
@Setter
@Getter

public class Image implements Element, Picture{
   private String url;
    private Element parent;
    private final Dimension dimension;
    private final String imageContent;


    public Image(String url) {
        this.url = url;
        this.dimension = null;
        this.imageContent = null;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image(String url, String imageContent) {
        this.url = url;
        this.dimension = null;
        this.imageContent = imageContent;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image(String url, Dimension dimension) {
        this.url = url;
        this.dimension = dimension;
        this.imageContent = null;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image(String url, String imageContent, Dimension dimension) {
        this.url = url;
        this.dimension = dimension;
        this.imageContent = imageContent;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void renderImage() throws Exception {
        new ImageFactory().create(this.url);
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dimension;
    }

    @Override
    public String content() {
        return this.imageContent;
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
    public void add(Element element) throws Exception {
        throw new Exception("You cannot add an item to a leaf!");
    }

    @Override
    public void remove(Element element) throws Exception {
        throw new Exception("You cannot remove an item from a leaf!");
    }

    @Override
    public Element get(int index) throws Exception {
        throw new Exception("You cannot get the index of an item from a leaf");
    }

    @Override
    public void print() throws Exception {
        System.out.print("Image with name: " + this.url + "\n");
        this.renderImage();
    }
}
