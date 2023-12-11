package ro.uvt.info.splab;

public class Image {
    private String imageName;

    public Image (String imageName) {
        this.imageName = imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return this.imageName;
    }

    public String print() {
        return "Image: " + this.imageName;
    }
}
