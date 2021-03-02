package lite;

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


    public String generateNubanNumber(){
        stringBuilder = new StringBuilder(" ");
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


}
