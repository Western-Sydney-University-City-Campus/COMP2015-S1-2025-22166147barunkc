import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile4 {
    public static void main(String[] args) {
        String fileName = "numbers6.txt";
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int num1 = scanner.nextInt();
                String text = scanner.next();
                int num2 = scanner.nextInt();
                System.out.println(num1 + " " + text + " " + num2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
