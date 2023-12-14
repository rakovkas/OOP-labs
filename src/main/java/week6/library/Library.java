package week6.library;

import java.util.ArrayList;

public class Library extends StringUtils{

    ArrayList<Book> library = new ArrayList<>();

    public Library(){

    }

    public void addBook (Book newBook){
        this.library.add(newBook);
    }

    public void printBooks(){
        for(Book book : library){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library){
            if (Library.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher (String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library){
            if (Library.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear (int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
