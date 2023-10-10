package ro.uvt.info.splab;

public class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void SetImageName(String imageName) {
        this.imageName = imageName;
    }

    public String GetImageName() {
        return this.imageName;
    }

    public String print() {
        return "\nImage name: " + this.imageName;
    }
}
