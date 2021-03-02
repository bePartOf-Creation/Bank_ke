package lite;

import java.time.LocalDateTime;
import java.util.Random;

public class CurrentAccount extends Account{
    private double balance;
    private final double annualInterest;
    private final LocalDateTime accountOpeningDate;
    private final double minimumBalance;
    private double monthlyInterestRate;
    private String nubanNumber;
    StringBuilder stringBuilder;
    Random random = new Random();


    public CurrentAccount(double newBalance) {
        this.balance = newBalance;
        this.annualInterest = 0.05;
        this.minimumBalance = 1000.0;
        this.accountOpeningDate = LocalDateTime.now();
        this.monthlyInterestRate = getMonthlyInterestRate();
        this.nubanNumber = generateNubanNumber();
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
    @Override
    public void withdrawal(double withdrawalAmount) {
        boolean balanceIsInsufficient = withdrawalAmount > getBalance() || withdrawalAmount == getBalance();
        if(balanceIsInsufficient){
            this.balance = getMinimumBalance();
        }else{
            this.balance = ((getBalance() - withdrawalAmount) - getMinimumBalance());
        }
    }

    @Override
    public String generateNubanNumber() {
        stringBuilder = new StringBuilder("CA");
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        stringBuilder.append(number1).append(number2).append(" ");
        int count = 0;
        for(int i = 0; i < 14; i++){
            if(count == 4) {
                stringBuilder.append(" ");
                count = 0;
            }else{
                int number3 = random.nextInt(10);
                stringBuilder.append(number3);
                count++;
            }
        }
        return String.valueOf(stringBuilder);
    }


    public String getCurrentNubanNumber() {
        return  nubanNumber;
    }
}
