package app.bank;

import app.account.Account;


import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    List<Account> accountList;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}

    public List<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account) {
        if (accountList == null) accountList = new ArrayList<Account>();
        this.accountList.add(account);
    }
    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }
    public void displayAccounts() {
        for (Account account : accountList) {
            System.out.println("-------------------------------------------");
            account.print();
        }
    }
}
