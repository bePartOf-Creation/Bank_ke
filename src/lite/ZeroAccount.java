package lite;

import java.time.LocalDateTime;

public class ZeroAccount extends Account {
    private double balance;
    private final double annualInterestRate;
    private final LocalDateTime accountOpeningDate;
    private final double minimumBalance;
    private double monthlyInterest;

    public ZeroAccount(double newBalance) {
        this.balance = newBalance;
        this.annualInterestRate = 0.02;
        this.accountOpeningDate = LocalDateTime.now();
        this.minimumBalance = 100.0;
        this.monthlyInterest = getMonthlyInterestRate();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public double getMonthlyInterestRate() {
        monthlyInterest = annualInterestRate /12;
        return monthlyInterest;
    }

    @Override
    public void deposit(double amount) {
        this.balance = (getBalance() +amount) + getMinimumBalance();
    }

    @Override
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    @Override
    public LocalDateTime getAccountOpeningDate() {
        return accountOpeningDate;
    }
}
