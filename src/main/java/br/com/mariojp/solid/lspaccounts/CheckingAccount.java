package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.balance -= amount;
    }
}