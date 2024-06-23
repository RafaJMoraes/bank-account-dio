package app.account;

public interface IAccount {

    void deposit(double amount);
    void withdraw(double amount);
    void print();
    void transfer(double amount, IAccount destination);

}
