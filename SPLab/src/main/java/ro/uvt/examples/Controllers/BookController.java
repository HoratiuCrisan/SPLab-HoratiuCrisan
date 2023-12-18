package ro.uvt.examples.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.examples.BookService;
import ro.uvt.info.splab.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    //Lab 9 HTTP Methods
    @GetMapping
    public List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return this.bookService.getBookById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Map<String, String> requestBody) {
        String title = requestBody.get("title");
        this.bookService.createBook(title);
        return ResponseEntity.ok("Book " + title +" created successfully!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody Map<String, String> requestBody) {
        String title = requestBody.get("title");
        String responseMessage =  "Book " + this.bookService.getBookById(id).getTitle() + " updated to " + title;
        this.bookService.updateBook(id, title);
        return ResponseEntity.ok(responseMessage);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        this.bookService.deleteBook(id);
        return ResponseEntity.ok("Book " + id + " deleted successfully!");
    }

    @GetMapping("/statistics")
    public ResponseEntity<?> printStatistics() throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        RenderVisitor stats = new RenderVisitor();
        cap1.accept(stats);
        stats.getStatistics();
        return new ResponseEntity<>(stats.toString(), HttpStatus.OK);
    }
}
