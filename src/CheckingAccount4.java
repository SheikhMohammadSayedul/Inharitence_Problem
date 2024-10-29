import java.time.LocalDate;

public class CheckingAccount4 extends BankAccount4 {
    private int overdraftCount;
    private int currentMonth;

    public CheckingAccount4() {
        super();
        this.overdraftCount = 0;
        this.currentMonth = getCurrentMonth();
    }

    public CheckingAccount4(double initialBalance) {
        super(initialBalance);
        this.overdraftCount = 0;
        this.currentMonth = getCurrentMonth();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;

        int month = getCurrentMonth();
        if (month != currentMonth) {
            currentMonth = month;
            overdraftCount = 0;
        }

        if (amount > getBalance()) {
            overdraftCount++;
            double overdraftFee = overdraftCount == 1 ? 20 : 30;
            super.withdraw(amount + overdraftFee);
        } else {
            super.withdraw(amount);
        }
    }

    private int getCurrentMonth() {
        return LocalDate.now().getMonthValue();
    }
}
