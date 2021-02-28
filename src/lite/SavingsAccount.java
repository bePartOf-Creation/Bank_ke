package lite;

import java.time.LocalDateTime;

public class SavingsAccount extends Account {
    private double balance;
    private final double annualInterestRate;
    private final LocalDateTime accountOpeningDate;
    private final double minimumBalance;
    private double monthlyInterest;
    private final String nubanNumber;

    public SavingsAccount(double newBalance) {
        this.balance = newBalance + getMinimumBalance();
        this.annualInterestRate = 0.04;
        this.minimumBalance = 500.0;
        this.accountOpeningDate = LocalDateTime.now();
        this.monthlyInterest = getMonthlyInterestRate();
        this.nubanNumber = generateNubanNumber();
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
    }
    @Override
    public void withdrawal(double withdrawalAmount) {
        boolean balanceIsInsufficient = withdrawalAmount > getBalance() || withdrawalAmount == getBalance();
        if(balanceIsInsufficient){
            this.balance = getMinimumBalance();
            System.out.println(getBalance());
        }else{
            this.balance = ((getBalance()- withdrawalAmount) - getMinimumBalance());
        }
    }

    @Override
    public String generateNubanNumber() {
        stringBuilder = new StringBuilder("SA");
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

    public String getSavingsNubanNumber() {
        return  nubanNumber;
    }
}
