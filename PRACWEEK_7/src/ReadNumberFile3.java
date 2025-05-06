import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile3 {
    public static void main(String[] args) {
        String fileName = "numbers5.txt";
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int first = scanner.nextInt();
                float second = scanner.nextFloat();
                int third = scanner.nextInt();
                System.out.println(first + " " + second + " " + third);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
