package Library;

import Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;


    public Library() {
        books = new ArrayList<>();
    }

    public void  addBookToLibrary (Book book) {
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public void getBooksList(){
        for (Book book : getBooks()){
            System.out.println(book);
        }
    }

}

