package com.librarymanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import com.librarymanagement.models.Reader;
import com.librarymanagement.models.Role;
import com.librarymanagement.models.User;

public class ReaderTest {

    Reader newUser;
    @BeforeEach
    public void setup(){

        newUser = new Reader("1234", "Dare", "Dare12", Role.READER, "NewPass");


    }

    @Test
    public void testResetPassword(){

        // User newUser = new Reader();

        newUser.setPassword("23245");

        newUser.resetPassword();

        assertEquals("0000", newUser.getPassword());

    }

    // Is borrowed book initialized as an empty array?
    @Test
    public void borrowedBookInitCheck(){
        
        assertEquals(Collections.emptyList(), newUser.getBorrowedBooks());
    }
    
}
