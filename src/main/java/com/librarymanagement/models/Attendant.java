package com.librarymanagement.models;

public class Attendant extends User{

    private String id;

    public Attendant(String id, String name, String userName, String password, Role role){
        super(name, userName, password, role);
        this.id = id;
    } //end constructor 1

    public Attendant(){
        // TODO 
    } // end constructor 2

    public void issueBookToUser(Book book, User user){
        // TODO 

    }// End issueBookToUser

    public void returnBook(Book book){
        // TODO returnBook
    } // End returnBook
    
}
