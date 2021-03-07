package lite;

import java.util.Random;

public class DebitTransactions extends Transactions {
    private final String transactionId;


    StringBuilder stringBuilder;
    Random random = new Random();

    public DebitTransactions() {
        this.transactionId = generateTransactionId();
    }

    @Override
    public String generateTransactionId() {
       stringBuilder = new StringBuilder("DE");
       int number1 = random.nextInt(10);
       int number2 = random.nextInt(10);
       stringBuilder.append(number1).append(number2).append(" ");
       int count= 0;
       for(int i = 0; i < 14;i++){
           if(count == 4){
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

    public String getDebitTransactionId() {
        return transactionId;
    }
}