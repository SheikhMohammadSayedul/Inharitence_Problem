import java.util.Scanner;

public class CheckingAccountRunner18 {
    public static void main(String[] args) {
        CheckingAccount18 account = new CheckingAccount18(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'd' for deposit, 'w' for withdraw, 'e' for end of month, 'q' to quit:");
            String action = scanner.nextLine().trim().toLowerCase();

            switch (action) {
                case "d" -> {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Balance after deposit: " + account.getBalance());
                }
                case "w" -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Balance after withdrawal: " + account.getBalance());
                }
                case "e" -> {
                    account.endOfMonth();
                    System.out.println("End of month. Transaction count reset.");
                }
                case "q" -> {
                    System.out.println("Quitting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid action. Please try again.");
            }
            scanner.nextLine();
        }
    }
}
