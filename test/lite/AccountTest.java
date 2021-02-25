package lite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class AccountTest {
    ZeroAccount zeroAccount;
    SavingsAccount savingsAccount;
    CurrentAccount currentAccount;
    LocalDateTime localDateTime;
    Account newAccount;

    @BeforeEach
    void setUp() {
        currentAccount = new CurrentAccount(0.0);
        zeroAccount = new ZeroAccount(0.0);
        savingsAccount = new SavingsAccount(0.0);
        localDateTime = LocalDateTime.now();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_AllZeroAccountCanHaveABalance() {
        newAccount = new ZeroAccount(0.0);
        double balance = newAccount.getBalance();
        assertNotNull(newAccount);
        assertNotNull(zeroAccount);
        assertEquals(0.0, balance);
    }
    @Test
    void testThatCurrentAccountCanHaveBalance(){
        newAccount = new CurrentAccount(0.0);
        double balance = newAccount.getBalance();
        assertNotNull(currentAccount);
        assertEquals(0.0, balance);
    }
    @Test
    void testThatSavingsAccountCanHaveBalance(){
        newAccount = new SavingsAccount(0.0);
        double balance = newAccount.getBalance();
        assertNotNull(savingsAccount);
        assertEquals(0.0, balance);
    }
    @Test
    void testThat_ZeroAccountCanHaveTheirInterestRate(){
        newAccount = new ZeroAccount(0.0);
        double zeroRate = zeroAccount.getInterestRate();
        assertEquals(0.02,zeroRate);
    }
    @Test
    void testThat_SavingAccountCanHaveTheirInterestRate(){
        newAccount = new SavingsAccount(0.0);
        double savingsRate = savingsAccount.getInterestRate();
        assertEquals(0.04,savingsRate);
    }
    @Test
    void testThat_CurrentAccountCanHaveTheirInterestRate(){
        newAccount = new CurrentAccount(0.0);
        double currentRate = currentAccount.getInterestRate();
        assertEquals(0.05,currentRate);
    }
    @Test
    void testThat_AllZeroAccountsCanHaveAAccountOpeningDate(){
        newAccount = new ZeroAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(zeroAccount.getAccountOpeningDate());
        System.out.println(zeroAccount.getAccountOpeningDate());
    }
    @Test
    void testThat_AllCurrentAccountCanHaveAccountOpeningDate(){
        newAccount = new CurrentAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(currentAccount.getAccountOpeningDate());
        System.out.println(currentAccount.getAccountOpeningDate());
    }
    @Test
    void testThat_AllSavingsAccountCanHaveAccountOpeningDate(){
        newAccount = new SavingsAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(savingsAccount.getAccountOpeningDate());
        System.out.println(savingsAccount.getAccountOpeningDate());
    }
}