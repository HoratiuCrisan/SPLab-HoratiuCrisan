package ro.uvt.info.splab;

public class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void SetText(String text) {
        this.text = text;
    }

    public String GetText() {
        return this.text;
    }

    public String print() {
        return "\nText: " + this.text;
    }
}
