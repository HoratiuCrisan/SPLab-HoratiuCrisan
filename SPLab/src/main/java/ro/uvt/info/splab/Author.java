package ro.uvt.info.splab;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void print() {
        System.out.print("Name: " + this.name);
    }
}
