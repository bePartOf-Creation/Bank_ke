package lite;

import java.time.LocalDateTime;

public class CurrentAccount extends  Account{
    private double balance;
    private final double annualInterest;
    private final LocalDateTime accountOpeningDate;
    private final double minimumBalance;
    private double monthlyInterestRate;

    public CurrentAccount(double newBalance) {
        this.balance = newBalance;
        this.annualInterest = 0.05;
        this.minimumBalance = 1000.0;
        this.accountOpeningDate = LocalDateTime.now();
        this.monthlyInterestRate = getMonthlyInterestRate();
    }

    @Override
    public double getBalance() {
        return  balance;

    }

    @Override
    public double getAnnualInterestRate() {
        return annualInterest;
    }

    @Override
    public LocalDateTime getAccountOpeningDate() {
        return accountOpeningDate;
    }

    @Override
    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public double getMonthlyInterestRate() {
        monthlyInterestRate = annualInterest /12;
        return monthlyInterestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance = (getBalance() +amount) + getMinimumBalance();
    }
}
