package lite;

public enum TransactionType {
    DEBIT, TRANSFER,CREDIT;

    @Override
    public String toString() {
        String type = " ";
        switch (this){
            case DEBIT -> {
                type = "DEBIT";
            }
            case TRANSFER -> {
                type = "TRANSFER";
            }
       }
        return type;
    }
}
