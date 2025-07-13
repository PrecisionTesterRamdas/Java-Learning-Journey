package step07_oops;

public class BankAccount {

	int accountNumber;
	String accountHolderName;
	double balance;

	BankAccount(int an, String ahn, double b) {
		this.accountNumber = an;
		this.accountHolderName = ahn;
		this.balance = b;
	}

	public void displayAccountInfo() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account holder name: " + accountHolderName);
		System.out.println("Account balance: " + balance);
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing " + amount + "...");
	}

	public void withdraw(double amount) {
		if (balance >= amount) {

			balance = balance - amount;
			System.out.println("Withdrawing " + amount + "...");
		} else {
			System.out.println("Insufficient balance...");
		}
	}

	public static void main(String[] args) {

		BankAccount ba = new BankAccount(101, "Ramdas", 4500);
		ba.displayAccountInfo();
		ba.deposit(1500);
		ba.withdraw(5000);
		ba.displayAccountInfo();
	}
}
