package ro.uvt.info.splab;

public class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public String GetTitle() {
        return this.title;
    }

    public String print() {
        return "\nTitle: " + this.title;
    }
}
