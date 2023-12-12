package ro.uvt.info.splab;

public interface Visitor<T> {
    public T visitBook(Book book);
    public T visitSection(Section section);
    public T visitTableOfContents(TableOfContents tableOfContents);
    public T visitParagraph(Paragraph paragraph);
    public T visitImageProxy(ImageProxy imageProxy);
    public T visitImage(Image image);
    public T visitTable(Table table);
}
