package ro.uvt.info.splab;

public class Image implements Element{
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

    @Override
    public String print() {
        return "Image: " + this.imageName;
    }
}
