package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

public class Author {
    @Getter
    @Setter
    private String name;

    public Author (String name) {
        this.name = name;
    }

    public String print() {
        return "Author: " + this.name;
    }
}
