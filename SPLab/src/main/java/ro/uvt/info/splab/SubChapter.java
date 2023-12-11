package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    @Getter
    @Setter
    private String name;

    private Collection<Element> elementList = new ArrayList<>();

    public void createNewElement(Element element) {
        this.elementList.add(element);
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public String print() {
        StringBuilder text = new StringBuilder("SubChapter: " + this.name + "\n");

        for (Element elem : this.elementList) {
            if (elem instanceof Paragraph)
                text.append(((Paragraph)elem).print()).append("\n");
            else if (elem instanceof Image)
                text.append(((Image)elem).print()).append("\n");
            else
                text.append(((Table)elem).print()).append("\n");
        }

        return text.toString();
    }
}
