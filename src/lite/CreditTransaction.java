package lite;

import java.util.Random;

public class CreditTransaction extends Transaction {
    StringBuilder stringBuilder;
    Random random = new Random();
    private final String transactionId;

    public CreditTransaction() {
        super(TransactionType.CREDIT, 5000);
        this.transactionId = generateTransactionId();
    }
    @Override
    public String generateTransactionId() {
        stringBuilder = new StringBuilder("CT");
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        stringBuilder.append(number1).append(number2).append(" ");

        return String.valueOf(stringBuilder);
    }
    public String getCreditTransactions() {
        return transactionId;
    }
}
