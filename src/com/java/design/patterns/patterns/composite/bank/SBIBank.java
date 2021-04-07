package com.java.design.patterns.patterns.composite.bank;

public class SBIBank extends BankAccountBaseClass {
    public SBIBank(int accountNumber) {
       this.setAccountNumber(accountNumber);
       this.setBankName("SBI");
    }
}
