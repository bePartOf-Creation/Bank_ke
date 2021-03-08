package lite;

public class FeeDetails {
    private final int feeAmount;
    private final String feeType;
    private final String feeDescription;

    public FeeDetails() {
        this.feeAmount = 42;
        this.feeType = "Bank_keh Fee";
        this.feeDescription = "Bank_keh Processing Fees";
    }
    public int getFeeAmount() {
        return feeAmount;
    }
    public String getFeeType() {
        return feeType;
    }

    public String getFeeDescription() {
        return feeDescription;
    }
}
