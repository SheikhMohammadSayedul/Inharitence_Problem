public class CheckingAccount4 extends BankAccount4 {
    private int overdraftCount;
    private int currentMonth;

    public CheckingAccount4() {
        super();
        overdraftCount = 0;
        currentMonth = getCurrentMonth();
    }

    public CheckingAccount4(double initialBalance) {
        super(initialBalance);
        overdraftCount = 0;
        currentMonth = getCurrentMonth();
    }

    @Override
    public void withdraw(double amount) {
        int month = getCurrentMonth();
        if (month != currentMonth) {
            currentMonth = month;
            overdraftCount = 0;
        }
        if (amount > 0) {
            if (amount > getBalance()) {
                overdraftCount++;
                if (overdraftCount == 1) {
                    super.withdraw(amount + 20);
                } else {
                    super.withdraw(amount + 30);
                }
            } else {
                super.withdraw(amount);
            }
        }
    }

    private int getCurrentMonth() {
        return java.time.LocalDate.now().getMonthValue();
    }
}
