package ro.uvt.examples;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import ro.uvt.info.splab.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Getter
@Setter
public class BookService {
    private  HashMap<Long, Book> bookList = new HashMap<>();
    private  long bookId = 0;



}
