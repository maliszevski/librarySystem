package Book;

import java.util.Random;

public class Book {
    public String title;
    public String author;
    public int id;
    public boolean isAvailable;
    private static final  Random random = new Random();

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id = setId();
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", " +
                "Title = " + title + ", " +
                "Author = " + author + ", " +
                "Id=" + id + ", " +
                "isAvailable=" + isAvailable;
    }

    private int setId(){
        return random.nextInt(1000);
    }

}
