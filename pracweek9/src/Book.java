
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // No-arg constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.available = true;
    }

    // Constructor with parameters
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getters and toString
    public String toString() {
        return String.format("%-25s %-15s %-13s %-10s", title, author, isbn, available);
    }
}
