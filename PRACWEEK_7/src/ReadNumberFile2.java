
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile2 {
    public static void main(String[] args) {
        String fileName = "numbers3.txt";  // Change to test other files
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(num1 + " " + num2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
