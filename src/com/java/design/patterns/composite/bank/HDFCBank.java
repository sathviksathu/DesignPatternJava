package com.java.design.patterns.composite.bank;

public class HDFCBank extends BankAccountBaseClass {

    public HDFCBank(int accountNumber) {
       this.setAccountNumber(accountNumber);
       this.setBankName("HDFC");
    }


}
