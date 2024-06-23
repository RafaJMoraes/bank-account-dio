package app.account;

import app.customer.Customer;

public abstract class Account implements IAccount {

    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENCE = 1;

    private int agency;
    private int number;
    private double balance;
    protected Customer customer;

    public Account(Customer customer) {
        this.agency = Account.AGENCY_DEFAULT;
        this.number = Account.SEQUENCE++;
        this.balance = 0.0;
        this.customer = customer;
    }


    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public void print() {
        System.out.printf("Titular: %s%n", this.customer.getName());
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.printf("Saldo: %.2f%n", this.balance);
    }

    @Override
    public void transfer(double amount, IAccount destination) {
        this.withdraw(amount);
        destination.deposit(amount);
    }

    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getAgency(){
        return this.agency;
    }
    public void setAgency(int agency){
        this.agency = agency;
    }

}
