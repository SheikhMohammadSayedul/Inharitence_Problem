public class Main4 {
    public static void main(String[] args) {
        CheckingAccount4 account = new CheckingAccount4(100);
        System.out.println("Initial balance: " + account.getBalance());
        account.withdraw(150);
        System.out.println("Balance after first overdraft: " + account.getBalance());
        account.withdraw(150);
        System.out.println("Balance after second overdraft: " + account.getBalance());
        account.withdraw(150);
        System.out.println("Balance after third overdraft: " + account.getBalance());
    }
}
