package com.java.casestudies.library;

public class Member extends Account{

    private int totalCheckedOutBooks;
    private AccountStatus acctStatus;

    public Member(String password, AccountStatus status, Person person) {
        super(password, status, person);
        totalCheckedOutBooks = 0;
        acctStatus = AccountStatus.ACTIVE;
    }

    public int getTotalCheckedOutBooks() {
        return totalCheckedOutBooks;
    }

    public void setTotalCheckedOutBooks(int totalCheckedOutBooks) {
        this.totalCheckedOutBooks = totalCheckedOutBooks;
    }

    public AccountStatus getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(AccountStatus acctStatus) {
        this.acctStatus = acctStatus;
    }
}
