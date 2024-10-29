public class TestProgram1 {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100.0);

        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(50.0);
        System.out.println("Balance after deposit of $50: " + account.getBalance());
        account.withdraw(30.0);
        System.out.println("Balance after withdrawal of $30: " + account.getBalance());
        account.withdraw(150.0);
        System.out.println("Balance after attempted withdrawal of $150: " + account.getBalance());
    }
}

