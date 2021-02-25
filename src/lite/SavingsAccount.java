package lite;

import java.time.LocalDateTime;

public class SavingsAccount extends Account{
    private final double balance;
    private final double interestRate;
    private final LocalDateTime accountOpeningDate;

    public SavingsAccount(double newBalance) {
        this.balance = newBalance;
        this.interestRate = 0.04;
        this.accountOpeningDate = LocalDateTime.now();
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public LocalDateTime getAccountOpeningDate() {
        return accountOpeningDate;
    }
}
