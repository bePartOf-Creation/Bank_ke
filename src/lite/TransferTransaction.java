package lite;

import java.util.Random;

public class TransferTransaction extends Transaction {
    StringBuilder stringBuilder;
    Random random = new Random();
    public TransferTransaction() {
        super(TransactionType.TRANSFER,500);
    }
    @Override
    public String generateTransactionId() {
        stringBuilder = new StringBuilder("TT");
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        stringBuilder.append(number1).append(number2).append(" ");
        return String.valueOf(stringBuilder);
    }

}
