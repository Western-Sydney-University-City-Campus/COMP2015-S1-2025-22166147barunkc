import java.util.Scanner;

public class ArrayPlay {
    static Scanner input = new Scanner(System.in);
    static int[] numbers = {5, 10, 15, 20, 25};

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display array");
            System.out.println("2. Display array backwards");
            System.out.println("3. Display total of array values");
            System.out.println("4. Display average of array values");
            System.out.println("5. Fill array with new values");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayArray();
                    break;
                case 2:
                    displayArrayReverse();
                    break;
                case 3:
                    System.out.println("Total: " + totalArray());
                    break;
                case 4:
                    System.out.println("Average: " + averageArray());
                    break;
                case 5:
                    fillArray();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    public static void displayArray() {
        System.out.println("Array values:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArrayReverse() {
        System.out.println("Array values in reverse:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int totalArray() {
        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }

    public static double averageArray() {
        return (double) totalArray() / numbers.length;
    }

    public static void fillArray() {
        System.out.println("Enter " + numbers.length + " new values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
    }
}
