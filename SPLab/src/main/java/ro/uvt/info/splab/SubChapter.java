package ro.uvt.info.splab;

public class SubChapter {
    private String name;
    private Image subChapterImage;
    private Paragraph subChapterParagraph;
    private Table subChapterTable;

    public SubChapter(String name, Image subChapterImage, Paragraph subChapterParagraph, Table subChapterTable) {
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

    public void SetSubChapterImage(Image subChapterImage) {
        this.subChapterImage = subChapterImage;
    }

    public Image GetSubChapterImage() {
        return this.subChapterImage;
    }

    public void SetSubChapterParagraph(Paragraph subChapterParagraph) {
        this.subChapterParagraph = subChapterParagraph;
    }

    public Paragraph GetSubChapterParagraph() {
        return this.subChapterParagraph;
    }

    public void SetSubChapterTable(Table subChapterTable) {
        this.subChapterTable = subChapterTable;
    }

    public Table GetSubChapterTable() {
        return  this.subChapterTable;
    }

    public String print() {
        return "\nSubchapter :" + this.name +
                this.subChapterImage.print() +
                this.subChapterParagraph.print() +
                this.subChapterTable.print();
    }
}
