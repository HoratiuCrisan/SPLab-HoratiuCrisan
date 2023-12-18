package ro.uvt.examples;

import org.springframework.stereotype.Service;
import ro.uvt.info.splab.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final Map<Long, Book> bookList = new HashMap<>();
    private long bookId = 0;
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookList.values());
    }

    public Book getBookById(Long id) {
        return this.bookList.get(id);
    }

    public void createBook(String title) {
        Book book = new Book(title);
        book.setId(bookId);
        book.setTitle(title);
        bookList.put(bookId, book);
        bookId++;
    }

    public void updateBook(Long id, String title) {
        if (this.bookList.containsKey(id)) {
            this.bookList.get(id).setTitle(title);
        }
    }

    public void deleteBook(Long id) {
        if (this.bookList.containsKey(id))
            this.bookList.remove(id);
        else
            System.out.println("Book " + id + "does not exist!");
    }
}
