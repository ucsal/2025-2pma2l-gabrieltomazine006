package br.com.mariojp.solid.lspaccounts;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankServiceTest {

    @Test
    void checking_account_allows_withdrawal() {
        var acc = new CheckingAccount();
        new BankService().processDeposit(acc, 100); 
        new BankService().processWithdrawal(acc, 50); 
        assertEquals(50, acc.getBalance());
    }
    @Test
    void savings_account_should_not_throw_and_should_not_withdraw() {
        var acc = new SavingsAccount();
        new BankService().processDeposit(acc, 100);
        assertEquals(100, acc.getBalance(), 0.0001,
                "Poupança não deve ter saldo reduzido em operação de saque");
    }
}