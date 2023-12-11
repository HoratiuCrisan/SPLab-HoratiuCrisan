package ro.uvt.info.splab;

public class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String print() {
        return "Table: " + this.title;
    }
}
