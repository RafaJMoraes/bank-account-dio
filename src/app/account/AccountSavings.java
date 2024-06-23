package app.account;

import app.customer.Customer;

public class AccountSavings extends Account{

    public AccountSavings(Customer customer) {
        super(customer);
    }

    @Override
    public void print() {
        System.out.println("***** AccountSavings extract ******");
        super.print();
    }
}
