import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryManagerArray {
    public static void main(String[] args) {
        Book[] books = new Book[20];
        Patron[] patrons = new Patron[9];
        int bookCount = 0;
        int patronCount = 0;

        try (Scanner bookFile = new Scanner(new File("Book.java"))) {
            while (bookFile.hasNextLine() && bookCount < books.length) {
                String[] data = bookFile.nextLine().split(",");
                books[bookCount++] = new Book(data[0], data[1], data[2], Boolean.parseBoolean(data[3]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Book.java not found");
        }

        try (Scanner patronFile = new Scanner(new File("Patron.java"))) {
            while (patronFile.hasNextLine() && patronCount < patrons.length) {
                String[] data = patronFile.nextLine().split(",");
                patrons[patronCount++] = new Patron(data[0], data[1], Integer.parseInt(data[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("patron.java not found.");
        }

        System.out.println("\nBooks (Array):");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }

        System.out.println("\nPatrons (Array):");
        for (int i = 0; i < patronCount; i++) {
            System.out.println(patrons[i]);
        }
    }
}
