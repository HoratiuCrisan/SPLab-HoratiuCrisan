package ro.uvt.examples.Commands;

import ro.uvt.info.splab.Book;

import java.util.ArrayList;
import java.util.HashMap;

public class GetBookCommand implements Command{
    private final HashMap<Long, Book> bookHashMap;

    public GetBookCommand(HashMap<Long, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
    }

    @Override
    public ArrayList<Book> execute() {
        return new ArrayList<>(this.bookHashMap.values());
    }
}
