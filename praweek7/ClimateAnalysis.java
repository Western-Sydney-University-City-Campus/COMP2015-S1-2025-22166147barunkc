
public class ClimateAnalysis {

	public ClimateAnalysis() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.util.InputMismatchException;
		import java.util.Scanner;

		public class ClimateAnalysis {
		    public static void main(String[] args) {
		        String fileName = "TempChange_1970-1979.txt"; // Make sure this file is in your project root

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
		                    for (int i = 0; i < 10; i++) {
		                        sum += lineScanner.nextDouble();
		                    }
		                    double avg = sum / 10.0;

		                    System.out.printf("%-20s %-6s %6.3f%n", country, code, avg);
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

	}

}
