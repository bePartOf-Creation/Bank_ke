package lite;

public abstract class Transaction {

    private double amount;
    private  TransactionType transactionType;

    public Transaction(TransactionType transactionType, double amount){
        this.transactionType = transactionType;
    }
    public abstract String generateTransactionId();

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

}
