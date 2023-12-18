package ro.uvt.examples.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.examples.BookService;
import ro.uvt.examples.Commands.*;
import ro.uvt.info.splab.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
    private CommandInvoker invoker;


    //Lab 9 HTTP Methods
    @GetMapping
    public List<Book> getBooks() {
        GetBookCommand command = new GetBookCommand(this.bookService.getBookList());
        invoker = new CommandInvoker(command);
        //invoker.setCommand(command);
        invoker.executeCommand();

        return new ArrayList<>(this.bookService.getBookList().values());
    }

    @GetMapping("/{id}")
    public void getBookById(@PathVariable Long id) {
        GetBookByIdCommand command = new GetBookByIdCommand(id, this.bookService.getBookList());
        invoker = new CommandInvoker(command);
        //invoker.setCommand(command);
        invoker.executeCommand();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Map<String, String> requestBody) {
        String title = requestBody.get("title");
        CreateBookCommand command = new CreateBookCommand(title, this.bookService.getBookId(), this.bookService.getBookList());
        invoker = new CommandInvoker(command);
        invoker.setCommand(command);
        invoker.executeCommand();
        this.bookService.setBookId(this.bookService.getBookId() + 1);
        return ResponseEntity.ok("Book " + title +" created successfully!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody Map<String, String> requestBody) {
        String title = requestBody.get("title");
        String responseMessage =  "Book updated to " + title;
        UpdateBookCommand command = new UpdateBookCommand(title, id, this.bookService.getBookList());
        invoker = new CommandInvoker(command);
        //invoker.setCommand(command);
        invoker.executeCommand();
        return ResponseEntity.ok(responseMessage);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        DeleteBookCommand command = new DeleteBookCommand(id, this.bookService.getBookList());
        invoker = new CommandInvoker(command);
        //invoker.setCommand(command);
        invoker.executeCommand();
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
