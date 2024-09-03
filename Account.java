// program to display deposit,withdraw,Balance  amount to the account.
public class Account {

        private double balance;

        // No-argument constructor
        public Account() {
            this.balance = 0.0; // Default balance is 0
        }

        // Constructor with two arguments
        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        // Method to deposit amount to the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw amount from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Method to display the balance
        public void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }

        // Main method to test the Account class
        public static void main(String[] args) {
            Account account1 = new Account(); // Using no-argument constructor
            Account account2 = new Account(1000.0); // Using constructor with initial balance

            // Testing account1
            account1.deposit(500.0);
            account1.withdraw(200.0);
            account1.displayBalance(); // Should display: Current Balance: 300.0

            // Testing account2
            account2.deposit(150.0);
            account2.withdraw(50.0);
            account2.displayBalance(); // Should display: Current Balance: 1100.0
        }
    }

