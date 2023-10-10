package ro.uvt.info.splab;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");

        discoTitanic.AddAuthor(author);
        int indexChapterOne = discoTitanic.CreateChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.GetChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.CreateSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.GetSubChapter(indexChapterOne);

        scOneOne.CreateNewParagraph("Paragraph 1");
        scOneOne.CreateNewParagraph("Paragraph 2");
        scOneOne.CreateNewParagraph("Paragraph 3");
        scOneOne.CreateNewImage("Image 1");
        scOneOne.CreateNewParagraph("Paragraph 4");
        scOneOne.CreateNewTable("Table 1");
        scOneOne.CreateNewParagraph("Paragraph 5");

        System.out.println(scOneOne.print());
    }
}
