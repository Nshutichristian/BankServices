import java.util.Scanner;

public class BankApplication {
	Scanner input = new Scanner(System.in);
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("MidFirst Banking App\n");
		System.out.print("\n");

		System.out.print("Enter the unique ID: ");
		String uniqueID = keyboard.nextLine();
		while (uniqueID.length() < 4) {
			System.out.println("!!!ERROR: unique IDs are at least 4 characters long!!!\n");
			System.out.print("Enter the unique ID: ");
			uniqueID = keyboard.nextLine();
		}

		System.out.print("Enter the Initial Balance: \n");
		double balance = keyboard.nextInt();

		while (balance < 500) {
			System.out.println("!!!ERROR: new accounts need at least $500!!! \n");
			System.out.print("Enter the Initial Balance: \n");
			balance = keyboard.nextInt();
		}

		System.out.print("Enter the annual interest rate as a percentage: \n");
		double annualInterestRate = keyboard.nextDouble();
		int selection;
		CheckingAccount checkingAccount = new CheckingAccount(uniqueID, balance, annualInterestRate);
		
		do {
			System.out.print("========================\n");
			System.out.print("=       OPTIONS        =\n");
			System.out.print("========================\n");
			System.out.print("\n");
			System.out.print("1. Deposit\n");
			System.out.print("2. View Daily Interest Rate\n");
			System.out.print("3. View Account Details\n");
			System.out.print("4. Exit\n");
			System.out.print("\n");
			System.out.print("\n");

			System.out.print("\n");
			System.out.print("\n");
			System.out.print("Enter your selection: \n");
			
			selection = keyboard.nextInt();
			while (selection < 1 || selection > 4) {
				System.out.println("INVALID SELECTION - TRY AGAIN!: \n");
				selection = keyboard.nextInt();
			}

			if (selection == 1) {
				System.out.print("Enter your deposit amount: \n");
				int deposit = keyboard.nextInt();

				while (deposit <= 0) {
					System.out.println("!!!ERROR: deposits must be great than $0!!! \n");
					System.out.print("Enter your deposit amount: \n");
					deposit = keyboard.nextInt();
				}

				// checkingAccount.setAcctBalance(checkingAccount.getAcctBalance() + deposit);
				checkingAccount.deposit(deposit);
				System.out.print("\n");

				System.out.print("New balance: " + checkingAccount.getAcctBalance() + "\n");

			}

			else if (selection == 2) {
				System.out.print("Your Daily Interest Amount is: " + checkingAccount.getAnnualInterestRate() + "\n");
			}

			else if (selection == 3) {
				System.out.print("Account Unique ID: " + uniqueID + "\n");
				System.out.print("Account Creation Date/Time: " + checkingAccount.getCreatedDateTime() + "\n");
				System.out.print("Balance: " + checkingAccount.getAcctBalance() + "\n");
				System.out.print("Daily Interest Amount: " + checkingAccount.getAnnualInterestRate() + "\n");
			}

			else if (selection == 4) {
				System.out.print("Account Unique ID: " + uniqueID + "\n");
				System.out.print("Account Creation Date/Time: " + checkingAccount.getCreatedDateTime() + "\n");
				System.out.print("Balance: " + checkingAccount.getAcctBalance() + "\n");
				System.out.print("Daily Interest Amount: " + checkingAccount.getAnnualInterestRate() + "\n");

				exit(0);
			}
		} while (selection != 4);

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub

	}
}
