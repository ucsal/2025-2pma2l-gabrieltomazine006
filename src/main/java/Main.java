import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        CheckingAccount checking = new CheckingAccount();
        bankService.processDeposit(checking, 100);
        System.out.println("Saldo da Checking antes do saque: " + checking.getBalance());

        bankService.processWithdrawal(checking, 30);
        System.out.println("Saldo da Checking após o saque: " + checking.getBalance());

        SavingsAccount savings = new SavingsAccount();
        bankService.processDeposit(savings, 100);
        System.out.println("Saldo da Savings: " + savings.getBalance());

        bankService.processWithdrawal(savings, 30); // não faz nada, não lança exceção
        System.out.println("Saldo da Savings após tentativa de saque: " + savings.getBalance());
    }
}