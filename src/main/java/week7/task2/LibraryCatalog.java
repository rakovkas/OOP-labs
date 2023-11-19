package week7.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    protected List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books = books;
    }

    public Optional<Book> checkAvailability (String bookTitle){
        return books.stream()
                .filter(book -> book.title().equals(bookTitle))
                .findFirst()
                .filter(book -> book.available());
    }

    public Optional<Book> getDetailsAuthor (String bookAuthor){
        return books.stream()
                .filter(book -> book.author().equals(bookAuthor) && book.available())
                .findFirst();
    }

    public void updateStatus (String bookTitle, boolean available){
        books.stream()
                .filter(book -> book.title().equals(bookTitle))
                .findFirst()
                .ifPresent(book -> book=new Book(
                        book.title(), book.author(), book.year(), available
                ));
    }


}
