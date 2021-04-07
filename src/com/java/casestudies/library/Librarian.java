package com.java.casestudies.library;

public class Librarian extends Account {

    public Librarian(String password, AccountStatus status, Person person) {
        super(password, status, person);
    }

    public void addBookItem(Book book){
        System.addBook(book);
        java.lang.System.out.println("Book "+book.getTitle()+" has been added");
    }

    public boolean blockMember(Member member){
        member.setAcctStatus(AccountStatus.BLACKLISTED);
        return true;
    }

    public boolean unblockMember(Member member){
        member.setAcctStatus(AccountStatus.ACTIVE);
        return true;
    }




}
