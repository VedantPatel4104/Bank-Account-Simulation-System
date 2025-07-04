import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankOperations bank = new BankOperations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bank.createAccount();
                case 2 -> bank.deposit();
                case 3 -> bank.withdraw();
                case 4 -> bank.checkBalance();
                case 5 -> bank.viewAllAccounts();
                case 6 -> System.out.println("👋 Exiting...");
                default -> System.out.println("⚠️ Invalid choice.\n");
            }
        } while (choice != 6);
    }
}
