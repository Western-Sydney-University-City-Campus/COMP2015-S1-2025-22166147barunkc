
public class BankAccount {

		// TODO Auto-generated method stub
		 private int accountNumber;
		    private String accountHolder;
		    private double balance;
		    private double monthDeposits;
		    private double monthWithdrawals;

		    // Default constructor
		    public BankAccount() {
		        this.accountNumber = 0;
		        this.accountHolder = "Unknown";
		        this.balance = 0;
		        this.monthDeposits = 0;
		        this.monthWithdrawals = 0;
		    }

		    // Parameterized constructor
		    public BankAccount(int accountNumber, String accountHolder, double openingBalance) {
		        this.accountNumber = accountNumber;
		        this.accountHolder = accountHolder;
		        this.balance = (openingBalance >= 0) ? openingBalance : 0;
		        this.monthDeposits = 0;
		        this.monthWithdrawals = 0;
		    }

		    // Deposit method
		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            monthDeposits += amount;
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }

		    // Withdraw method
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		            balance -= amount;
		            monthWithdrawals += amount;
		        } else {
		            System.out.println("Invalid or insufficient funds for withdrawal.");
		        }
		    }

		    // Reset monthly totals
		    public void resetMonthlyTotals() {
		        monthDeposits = 0;
		        monthWithdrawals = 0;
		    }

		    // Accessors
		    public double getBalance() {
		        return balance;
		    }

		    public double getMonthDeposits() {
		        return monthDeposits;
		    }

		    public double getMonthWithdrawals() {
		        return monthWithdrawals;
		    }

		    public String getAccountHolder() {
		        return accountHolder;
		    }

		    public int getAccountNumber() {
		        return accountNumber;
		    }

		    // Bonus eligibility
		    public boolean qualifiesForBonus() {
		        return balance > 1000 && monthDeposits >= 200 && monthWithdrawals <= 0;
		    }

		    // Optional: test main method for quick check
		    public static void main(String[] args) {
		        BankAccount test = new BankAccount(123, "Alice", 1200);
		        test.deposit(250);
		        test.withdraw(0); // try changing to 50 to see it disqualify
		        System.out.println("Bonus Eligible? " + (test.qualifiesForBonus() ? "Yes" : "No"));
		    }
		}
	


