package lite;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Account {

    private double balance;
    private LocalDateTime accountOpeningDate;
    private String nubanGenerator;


    public abstract double getBalance();

    public abstract double getInterestRate();

    public abstract LocalDateTime getAccountOpeningDate();
}

   
