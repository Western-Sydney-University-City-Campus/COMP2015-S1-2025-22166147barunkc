import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClimateAnalysisB {
    public static void main(String[] args) {
        String fileName = "TempChange_1961-2022.txt";

        System.out.println("File Processed: " + fileName);
        System.out.printf("%-20s %-6s %6s%n", "Country", "Code", "Avg");

        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);

                try {
                    String country = lineScanner.next();
                    String code = lineScanner.next();

                    double sum = 0;
                    int count = 0;

                    while (lineScanner.hasNext()) {
                        if (lineScanner.hasNextDouble()) {
                            sum += lineScanner.nextDouble();
                            count++;
                        } else {
                            lineScanner.next(); // Skip bad token
                        }
                    }

                    if (count > 0) {
                        double avg = sum / count;
                        System.out.printf("%-20s %-6s %6.3f%n", country, code, avg);
                    } else {
                        System.out.printf("%-20s %-6s %6s%n", country, code, "N/A");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Bad data in file. Please inspect file.");
                } catch (Exception e) {
                    System.out.println("Unexpected error while processing line.");
                }

                lineScanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
