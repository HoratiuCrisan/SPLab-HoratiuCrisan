package ro.uvt.info.splab;

public class Table implements Element{
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

    @Override
    public String print() {
        return "Table: " + this.title;
    }
}
