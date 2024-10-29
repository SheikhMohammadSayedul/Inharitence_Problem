public class BasicAccount extends BankAccount {
    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: insufficient funds.");
        }
    }
}

