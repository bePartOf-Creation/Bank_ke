package lite;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;

public abstract class Account {

    private double balance;
    private LocalDateTime accountOpeningDate;
    StringBuilder stringBuilder;
    Random random = new Random();


    public abstract double getBalance();

    public abstract double getAnnualInterestRate();

    public abstract LocalDateTime getAccountOpeningDate();

    public abstract double getMinimumBalance();

    public abstract double getMonthlyInterestRate();

    public abstract void deposit(double depositAmount);

    public abstract void withdrawal(double withdrawalAmount);

    public abstract String generateNubanNumber();

}
