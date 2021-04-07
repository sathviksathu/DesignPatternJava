package com.java.design.patterns.patterns.composite.bank;



public class Demo {
    public static void main(String[] args) {
        BankAccountBaseClass masterBankAcct = new BankAccountBaseClass();
        masterBankAcct.setBankName("All My banks");

        SBIBank sbiBank = new SBIBank(123);
        sbiBank.addTranscation(new Transaction(1,10000));
        sbiBank.addTranscation(new Transaction(2,20000));

        HDFCBank hdfcBank = new HDFCBank(456);
        hdfcBank.addTranscation(new Transaction(1,30000));
        hdfcBank.addTranscation(new Transaction(2,40000));

        masterBankAcct.addBank(sbiBank);
        masterBankAcct.addBank(hdfcBank);

        System.out.println("====Consolidated Bank Details of "+masterBankAcct.getBankName()+"=====");
        System.out.println(masterBankAcct.getAccountStatement());
        System.out.println("========================================");
        System.out.println("Total savings I have are");
        System.out.println(""+masterBankAcct.getTotalSavings());


    }
}
