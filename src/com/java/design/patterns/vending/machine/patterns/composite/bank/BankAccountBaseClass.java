package com.java.design.patterns.vending.machine.patterns.composite.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BankAccountBaseClass implements IBankAccoutInterface{
    private int accountNumber;
    private String bankName;
    private static int totalSavings;
    protected List<Transaction> transactionList = new ArrayList<>();
    private List<BankAccountBaseClass> banks = new ArrayList<>();

    public BankAccountBaseClass() {
        accountNumber = 0;
        totalSavings = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }




    public void addTranscation(Transaction transaction){
        this.transactionList.add(transaction);
    }
    public void addBank(BankAccountBaseClass bank){
        this.banks.add(bank);
    }
    @Override
    public String getAccountStatement() {
        StringBuilder sb = new StringBuilder();
        generateAccountStatement(sb,0);
        return sb.toString();
    }

    //recursion over all children to get all the Statements.
    private void generateAccountStatement(StringBuilder sb, int i) {
        sb.append(i>0 ?i+") ":"")
          .append(getAccountNumber() == 0 ? "":"Acct Number: "+getAccountNumber())
          .append(i > 0 ? " Bank Name: "+getBankName()+"\n" : "")
          .append(i>0? "Transactions\n":"")
          .append(i>0 ? generateAccountStatement(this):"");
        for(BankAccountBaseClass bank :  banks){
            bank.generateAccountStatement(sb,i+1);
        }
    }

    private String generateAccountStatement(BankAccountBaseClass bank){
        StringBuilder sb = new StringBuilder();
        for(Transaction transaction : transactionList){
            sb.append(transaction.getId()+" "+transaction.getAmount()+"\n");
        }
        return sb.toString();
    }

    @Override
    public int getTotalSavings() {
        return iterateOverAccounts();
    }

    //recursion over all children to get totalSavings
    private int iterateOverAccounts(){
        System.out.println("Iterating over: "+getBankName());
        int currTotal = 0;
        for(Transaction transaction : transactionList){
            currTotal+=transaction.getAmount();
        }
        System.out.println("Total: "+currTotal);
        totalSavings+=currTotal;
        for(BankAccountBaseClass bank : banks){
            System.out.println("Going to next bank with total: "+(totalSavings));
            bank.iterateOverAccounts();
        }
        return totalSavings;
    }



}
