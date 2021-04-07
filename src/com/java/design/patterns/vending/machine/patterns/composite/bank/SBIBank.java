package com.java.design.patterns.vending.machine.patterns.composite.bank;

import java.util.ArrayList;
import java.util.List;

public class SBIBank extends BankAccountBaseClass {
    public SBIBank(int accountNumber) {
       this.setAccountNumber(accountNumber);
       this.setBankName("SBI");
    }
}
