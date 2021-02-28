package lite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testThatCurrentAccountCanHaveBalance() {
        newAccount = new CurrentAccount(0.0);
        double balance = newAccount.getBalance();
        assertNotNull(currentAccount);
        assertEquals(0.0, balance);
    }

    @Test
    void testThatSavingsAccountCanHaveBalance() {
        newAccount = new SavingsAccount(0.0);
        double balance = newAccount.getBalance();
        assertNotNull(savingsAccount);
        assertEquals(0.0, balance);
    }

    @Test
    void testThat_ZeroAccountCanHaveTheirInterestRate() {
        newAccount = new ZeroAccount(0.0);
        double zeroRate = zeroAccount.getAnnualInterestRate();
        assertEquals(0.02, zeroRate);
    }

    @Test
    void testThat_SavingAccountCanHaveTheirInterestRate() {
        newAccount = new SavingsAccount(0.0);
        double savingsRate = savingsAccount.getAnnualInterestRate();
        assertEquals(0.04, savingsRate);
    }

    @Test
    void testThat_CurrentAccountCanHaveTheirInterestRate() {
        newAccount = new CurrentAccount(0.0);
        double currentRate = currentAccount.getAnnualInterestRate();
        assertEquals(0.05, currentRate);
    }

    @Test
    void testThat_AllZeroAccountsCanHaveAAccountOpeningDate() {
        newAccount = new ZeroAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(zeroAccount.getAccountOpeningDate());
        System.out.println(zeroAccount.getAccountOpeningDate());
    }

    @Test
    void testThat_AllCurrentAccountCanHaveAccountOpeningDate() {
        newAccount = new CurrentAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(currentAccount.getAccountOpeningDate());
        System.out.println(currentAccount.getAccountOpeningDate());
    }

    @Test
    void testThat_AllSavingsAccountCanHaveAccountOpeningDate() {
        newAccount = new SavingsAccount(0.0);
        localDateTime = LocalDateTime.now();
        assertNotNull(savingsAccount.getAccountOpeningDate());
        System.out.println(savingsAccount.getAccountOpeningDate());
    }

    @Test
    void testThat_savingsAccountCanHaveItsOwnMinimumBalance() {
        newAccount = new SavingsAccount(0.0);
        double minBalance = savingsAccount.getMinimumBalance();
        assertEquals(500.0, minBalance);
    }
    @Test
    void testThat_zeroAccountCanHaveItsOwnMinimumBalance() {
        newAccount = new SavingsAccount(0.0);
        double minBalance = zeroAccount.getMinimumBalance();
        assertEquals(100.0, minBalance);
    }
    @Test
    void testThat_currentAccountCanHaveItsOwnMinimumBalance() {
        newAccount = new SavingsAccount(0.0);
        double minBalance = currentAccount.getMinimumBalance();
        assertEquals(1000.0, minBalance);
    }
    @Test
    void testThat_savingsAccountCanGenerateMonthlyInterestRate() {
        newAccount = new SavingsAccount(0.0);
        double savingsMonthly = savingsAccount.getMonthlyInterestRate();
        assertEquals(0.0033333333333333335, savingsMonthly);
    }
    @Test
    void testThat_currentAccountCanGenerateMonthLyInterestRate(){
        newAccount = new CurrentAccount(0.0);
        double currentMonthly = currentAccount.getMonthlyInterestRate();
        assertEquals(0.004166666666666667,currentMonthly);
    }
    @Test
    void testThat_zeroAccountCanGenerateMonthlyInterestRate(){
        newAccount = new ZeroAccount(0.0);
        double zeroMonthly = zeroAccount.getMonthlyInterestRate();
        assertEquals(0.0016666666666666668,zeroMonthly);
    }
    @Test
    void test_That_savingsAccountCanDepositFunction(){
        newAccount = new SavingsAccount(0.0);
        savingsAccount.deposit(3000.0);
        assertEquals(3500.0,savingsAccount.getBalance());
    }
    @Test
    void test_That_currentAccountCanDepositFunction(){
        newAccount = new CurrentAccount(0.0);
        currentAccount.deposit(3000.0);
        assertEquals(4000.0,currentAccount.getBalance());
    }
    @Test
    void test_That_ZeroAccountCanDepositFunction(){
        newAccount = new ZeroAccount(0.0);
        zeroAccount.deposit(3000.0);
        assertEquals(3100.0,zeroAccount.getBalance());
    }
    @Test
    void test_That_savingsAccountCanHaveWithdrawal(){
        newAccount = new SavingsAccount(0.0);
        savingsAccount.deposit(2000);
        savingsAccount.withdrawal(2500.0);
        assertEquals(500.0,savingsAccount.getBalance());
    }
    @Test
    void test_That_currentAccountCanHaveWithdrawal(){
        newAccount = new CurrentAccount(0.0);
        currentAccount.deposit(7000.0);
        currentAccount.withdrawal(7000.0);
        assertEquals(0.0,currentAccount.getBalance());
    }

    @Test
    void test_That_SavingsAccountCanHaveTheirKindOfNubanNUmber(){
        zeroAccount = new ZeroAccount(0.0);
        String zeroNuban = zeroAccount.generateNubanNumber();
        System.out.println(zeroAccount.getZeroNubanNumber());
        assertNotNull(zeroNuban);
        assertNotNull(zeroAccount.getZeroNubanNumber());
    }
    @Test
    void test_That_CanGetSavingsAccountCanHaveNubanNUmber(){
        savingsAccount = new SavingsAccount(0.0);
        String savingsNuban = savingsAccount.generateNubanNumber();
        System.out.println(savingsAccount.getSavingsNubanNumber());
        assertNotNull(savingsNuban);
        assertNotNull(savingsAccount.getSavingsNubanNumber());
    }
    @Test
    void test_That_CurrentAccountCanHaveTheirAccountNumber(){
        currentAccount = new CurrentAccount(0.0);
        String currentNuban = currentAccount.generateNubanNumber();
        System.out.println(currentAccount.getCurrentNubanNumber());
        assertNotNull(currentNuban);
        assertNotNull(currentAccount.getCurrentNubanNumber());
    }

}
