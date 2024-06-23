import app.account.Account;
import app.account.AccountCurrent;
import app.account.AccountSavings;
import app.bank.Bank;
import app.customer.Customer;

public class Main {
    public static void main(String[] args) {

        System.out.println("DigitalBank Dio");
        System.out.println("---- create bank ----");
        Bank bankDio = new Bank("BankDio");
        Customer rafael = new Customer("Rafael",18L);
        Account accountCurrent = new AccountCurrent(rafael);

        Customer rafaelDio = new Customer("Ra Dio Santander",19L);
        Account accountSavings = new AccountSavings(rafaelDio);

        accountCurrent.deposit(100);
        accountCurrent.print();

        accountSavings.deposit(200);
        accountSavings.print();

        accountCurrent.deposit(300);
        accountCurrent.print();
        System.out.println("---- Bank transfer current to savings ----");
        accountCurrent.transfer(150, accountSavings);


        System.out.println("---- Add account on bank ----");
        bankDio.addAccount(accountCurrent);
        bankDio.addAccount(accountSavings);

        bankDio.displayAccounts();

        System.out.println("---- removed account current ----");
        bankDio.removeAccount(accountCurrent);

        bankDio.displayAccounts();

    }
}