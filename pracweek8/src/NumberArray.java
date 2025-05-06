import java.io.*;
import java.util.Scanner;

public class NumberArray {
    static final int MAX_SIZE = 100;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[MAX_SIZE];
        int count = readFile(numbers);

        if (count == 0) {
            System.out.println("No data read from file.");
            return;
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display sum");
            System.out.println("2. Display average");
            System.out.println("3. Display contents");
            System.out.println("4. Write contents to file");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum: " + total(numbers, count));
                    break;
                case 2:
                    System.out.println("Average: " + average(numbers, count));
                    break;
                case 3:
                    displayArray(numbers, count);
                    break;
                case 4:
                    writeToFile(numbers, count);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    public static int readFile(int[] array) {
        int count = 0;
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            while (fileScanner.hasNextInt() && count < array.length) {
                array[count++] = fileScanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return count;
    }

    public static int total(int[] array, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array, int count) {
        return count == 0 ? 0 : (double) total(array, count) / count;
    }

    public static void displayArray(int[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public static void writeToFile(int[] array, int count) {
        try (PrintWriter writer = new PrintWriter("numbersoutput.txt")) {
            for (int i = 0; i < count; i++) {
                writer.println(array[i]);
            }
            System.out.println("Data written to numbersoutput.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}


