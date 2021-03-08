package lite;

import java.util.Random;

public class DebitTransaction extends Transaction {
    private final String transactionId;
    private double debitAmount;
    private static final Random random = new Random();
    StringBuilder stringBuilder;

    public double getDebitAmount() {
        return debitAmount;
    }
    public DebitTransaction() {
        super(TransactionType.DEBIT, 5000);
        this.transactionId = generateTransactionId();
    }
    @Override
    public String generateTransactionId() {
       stringBuilder = new StringBuilder("DE");
       int number1 = random.nextInt(10);
       int number2 = random.nextInt(10);
       stringBuilder.append(number1).append(number2).append(" ");

        return String.valueOf(stringBuilder);
    }
    public String getDebitTransactionId() {
        return transactionId;
    }
}
