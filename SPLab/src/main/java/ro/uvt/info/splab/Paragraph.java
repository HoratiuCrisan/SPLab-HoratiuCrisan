package ro.uvt.info.splab;

public class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String print() {
        return "Paragraph: " + this.text;
    }
}
