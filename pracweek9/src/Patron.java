public class Patron {
    private String name;
    private String patronID;
    private int booksBorrowed;

    // No-arg constructor
    public Patron() {
        this.name = "";
        this.patronID = "";
        this.booksBorrowed = 0;
    }

    // Constructor with parameters
    public Patron(String name, String patronID, int booksBorrowed) {
        this.name = name;
        this.patronID = patronID;
        this.booksBorrowed = booksBorrowed;
    }

    // Getters and toString
    public String toString() {
        return String.format("%-20s %-10s %-5d", name, patronID, booksBorrowed);
    }
}
