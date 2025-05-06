
		import java.util.Scanner;

		public class BankAccountDemo {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        //Create BankAccount object
		        System.out.print("Enter account number: ");
		        int accNum = scanner.nextInt();
		        scanner.nextLine();
		        System.out.print("Enter account holder name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter opening balance: ");
		        double openingBalance = scanner.nextDouble();

		        BankAccount account = new BankAccount(accNum, name, openingBalance);

		        // Run the scenario for 3 months
		        for (int month = 1; month <= 3; month++) {
		            System.out.println("\nMonth " + month + " transactions:");

		            // Multiple deposits
		            for (int i = 1; i <= 2; i++) {
		                System.out.print("Enter deposit #" + i + ": ");
		                double dep = scanner.nextDouble();
		                account.deposit(dep);
		            }

		            // Multiple withdrawals
		            for (int i = 1; i <= 2; i++) {
		                System.out.print("Enter withdrawal #" + i + ": ");
		                double wit = scanner.nextDouble();
		                account.withdraw(wit);
		            }

		            // End-of-month summary
		            System.out.printf("\nEnd of Month %d Summary:\n", month);
		            System.out.println("Account Holder: " + account.getAccountHolder());
		            System.out.println("Account Number: " + account.getAccountNumber());
		            System.out.printf("Current Balance: $%.2f%n", account.getBalance());
		            System.out.printf("Deposits this month: $%.2f%n", account.getMonthDeposits());
		            System.out.printf("Withdrawals this month: $%.2f%n", account.getMonthWithdrawals());
		            System.out.println("Bonus Interest Applied: " + (account.qualifiesForBonus() ? "YES" : "NO"));

		            // Reset monthly totals
		            account.resetMonthlyTotals();
		        }

		        scanner.close();
		    }
		}

	


