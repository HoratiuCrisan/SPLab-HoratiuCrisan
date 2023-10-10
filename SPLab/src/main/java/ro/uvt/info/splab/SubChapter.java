package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    private String name;
    private Collection<Image> subChapterImage = new ArrayList<Image>();
    private Collection<Paragraph> subChapterParagraph = new ArrayList<Paragraph>();
    private Collection<Table> subChapterTable = new ArrayList<Table>();

    public SubChapter(String name) {
        this.name = name;
    }

    public SubChapter(String name, Collection<Image> subChapterImage, Collection<Paragraph> subChapterParagraph, Collection<Table> subChapterTable) {
        this.name = name;
        this.subChapterImage = subChapterImage;
        this.subChapterParagraph = subChapterParagraph;
        this.subChapterTable = subChapterTable;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName(String name) {
        return this.name;
    }

    public void SetSubChapterImage( Collection<Image> subChapterImage) {
        this.subChapterImage = subChapterImage;
    }

    public  Collection<Image> GetSubChapterImage() {
        return this.subChapterImage;
    }

    public void SetSubChapterParagraph(Collection<Paragraph> subChapterParagraph) {
        this.subChapterParagraph = subChapterParagraph;
    }

    public Collection<Paragraph> GetSubChapterParagraph() {
        return this.subChapterParagraph;
    }

    public void SetSubChapterTable(Collection<Table> subChapterTable) {
        this.subChapterTable = subChapterTable;
    }

    public Collection<Table> GetSubChapterTable() {
        return  this.subChapterTable;
    }

    public void CreateNewParagraph(String name) {
        this.subChapterParagraph.add(new Paragraph(name));
    }

    public void CreateNewImage(String name) {
        this.subChapterImage.add(new Image(name));
    }

    public void CreateNewTable(String name) {
        this.subChapterTable.add(new Table(name));
    }

    public String print() {
        String images = "\nImages: \n";
        for (Image img : this.subChapterImage)
            images += img.print();


        String paragraphs = "\nParagraphs: \n";
        for (Paragraph pgh : this.subChapterParagraph)
            paragraphs += pgh.print();

        String tables = "\nTables: \n";
        for (Table tbl : this.subChapterTable)
            tables += tbl.print();

        return "\nSubchapter :" + this.name +
                images +
                paragraphs +
                tables;
    }
}
