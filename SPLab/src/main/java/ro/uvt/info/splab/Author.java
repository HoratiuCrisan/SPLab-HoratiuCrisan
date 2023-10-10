package ro.uvt.info.splab;

public class Author {
    private String name;
    public Author(String name) {
        this.name = name;
    }

    public String GetAuthor() {
        return this.name;
    }

    public void SetAuthor(String name) {
        this.name = name;
    }
    public String print() {
        return this.name;
    }
}
