package app.account;

import app.customer.Customer;

public class AccountCurrent extends Account {

    public AccountCurrent(Customer customer) {
        super(customer);
    }

    @Override
    public void print() {
        System.out.println(" ********** Account Current extract **********");
        super.print();
    }
}
