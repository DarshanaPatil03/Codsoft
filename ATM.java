import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int inputPin;

        System.out.println("Welcome to ATM!");
        System.out.print("Enter your PIN: ");
        inputPin = scanner.nextInt();

        if (inputPin == pin) {
            System.out.println("PIN is correct. Please choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash(scanner);
                    break;
                case 3:
                    depositCash(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private void withdrawCash(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        }
    }

    private void depositCash(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1234, 1000.0);
        atm.run();
    }
}