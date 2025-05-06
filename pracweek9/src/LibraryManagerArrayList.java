
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagerArrayList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Patron> patrons = new ArrayList<>();

        try (Scanner bookFile = new Scanner(new File("booklist.csv"))) {
            while (bookFile.hasNextLine()) {
                String[] data = bookFile.nextLine().split(",");
                books.add(new Book(data[0], data[1], data[2], Boolean.parseBoolean(data[3])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("booklist.csv not found.");
        }

        try (Scanner patronFile = new Scanner(new File("patronlist.csv"))) {
            while (patronFile.hasNextLine()) {
                String[] data = patronFile.nextLine().split(",");
                patrons.add(new Patron(data[0], data[1], Integer.parseInt(data[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("patronlist.csv not found.");
        }

        System.out.println("\nBooks (ArrayList):");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\nPatrons (ArrayList):");
        for (Patron p : patrons) {
            System.out.println(p);
        }
    }
}
