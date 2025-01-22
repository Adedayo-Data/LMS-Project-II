package com.librarymanagement.models;

import java.util.ArrayList;
import java.util.List;

public class Reader extends User {

    private String Id;
    List<Book> borrowedBooks;

    public Reader(String Id, String name, String userName, Role role, String password){
        super(name, userName, password, role);
        this.Id = Id;
        this.borrowedBooks = new ArrayList<>();

    }

	// public Reader() {
    //     //TODO Auto-generated constructor stub
    // }

    @Override
	public void profileInfo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'profileInfo'");
	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getUserId'");
	}

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    
}
