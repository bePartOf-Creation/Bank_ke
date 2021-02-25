package lite;

import java.time.LocalDateTime;

public class SavingsAccount extends Account {
    private double balance;
    private final double annualInterestRate;
    private final LocalDateTime accountOpeningDate;
    private final double minimumBalance;
    private double monthlyInterest;

    public SavingsAccount(double newBalance) {
        this.balance = newBalance + getMinimumBalance();
        this.annualInterestRate = 0.04;
        this.minimumBalance = 500.0;
        this.accountOpeningDate = LocalDateTime.now();
        this.monthlyInterest = getMonthlyInterestRate();
    }

    public double getBalance() {
        return balance;
    }
    @Override
    public double getAnnualInterestRate() {
        return annualInterestRate;
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
        monthlyInterest = getAnnualInterestRate() / 12;
        return monthlyInterest;
    }
    @Override
    public void deposit(double amount) {
        this.balance = (getBalance() + amount) + getMinimumBalance();
        System.out.println(getBalance());
        System.out.println(getMinimumBalance());
    }

}
