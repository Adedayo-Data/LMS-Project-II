package com.librarymanagement.models;

public class Librarian extends User{

    protected Long Id;

    Librarian(String name, Role role, String password, Long Id){
        super(name, name, null, password);
        this.Id = Id;
    }

    public void addUser(User user){
        
    }
}