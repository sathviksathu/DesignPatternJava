package com.java.misc.library;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public Account( String password, AccountStatus status, Person person) {
        this.id = person.getEmail();
        this.password = password;
        this.status = status;
        this.person = person;
    }

    public boolean resetPassword(String newPassword){
        if(validate(newPassword) && !this.password.equals(newPassword)){
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public static boolean validate(String password) {
        return password!=null && !password.isEmpty() && password.length()>=7;
    }

}
