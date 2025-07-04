import java.util.ArrayList;
import java.util.Scanner;

public class BankOperations {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ₹");
        double balance = scanner.nextDouble();

        accounts.add(new BankAccount(accNo, name, balance));
        System.out.println("✅ Account created successfully!\n");
    }

    public BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        BankAccount acc = findAccount(accNo);

        if (acc != null) {
            System.out.print("Enter amount to deposit: ₹");
            double amount = scanner.nextDouble();
            acc.deposit(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    public void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        BankAccount acc = findAccount(accNo);

        if (acc != null) {
            System.out.print("Enter amount to withdraw: ₹");
            double amount = scanner.nextDouble();
            acc.withdraw(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        BankAccount acc = findAccount(accNo);

        if (acc != null) {
            System.out.println("💰 Balance: ₹" + acc.getBalance() + "\n");
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    public void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("📋 No accounts found.\n");
            return;
        }
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
        System.out.println();
    }
}

