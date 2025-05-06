import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile1 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";  // Change to test other files
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
