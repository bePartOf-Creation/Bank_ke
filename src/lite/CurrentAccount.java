package lite;

import java.time.LocalDateTime;

public class CurrentAccount extends  Account{
    private final double balance;
    private final double interestRate;
    private final LocalDateTime accountOpeningDate;

    public CurrentAccount(double newBalance) {
        this.balance = newBalance;
        this.interestRate = 0.05;
        this.accountOpeningDate = LocalDateTime.now();
    }

    @Override
    public double getBalance() {
        return  balance;
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
