package ro.uvt.info.splab;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    @Getter
    @Setter
    private String name;
    private Collection<Image> imageList = new ArrayList<>();
    private Collection<Paragraph> paragraphList = new ArrayList<>();
    private Collection<Table> tableList = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewImage(String image) {
        this.imageList.add(new Image(image));
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphList.add(new Paragraph(paragraph));
    }

    public void createNewTable(String table) {
        this.tableList.add(new Table(table));
    }

    public String print() {
        StringBuilder text = new StringBuilder("SubChapter: " + this.name + "\n");
        for (Paragraph paragraph : this.paragraphList)
            text.append(paragraph.print()).append("\n");

        for (Image img : this.imageList)
            text.append(img.print()).append("\n");

       for (Table table : this.tableList)
            text.append(table.print()).append("\n");

        return text.toString();
    }
}
