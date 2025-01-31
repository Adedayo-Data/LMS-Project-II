package com.librarymanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

// import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.librarymanagement.models.Attendant;
import com.librarymanagement.models.Reader;
import com.librarymanagement.models.Book;

public class AttendantTest{

    Attendant attend;

    @BeforeEach
    public void setup(){

        attend = new Attendant();
    } // end setup

    @Test
    public void issueBookToUserTest(){

        // Mock the book class
        Book book = mock(Book.class);
        // Mock the user class
        Reader user = mock(Reader.class);

        // ArrayList to mimick  - borrowedBook of user
        List<Book> borrowedBook = new ArrayList<>();
        when(user.getBorrowedBooks()).thenReturn(borrowedBook);

        attend.issueBookToUser(book, user);
        // Assert - Array size increase
        assertEquals(1, borrowedBook.size());
        
        // Assert - That the book is the book specified
        assertTrue(borrowedBook.contains(book));

    }

    @Test
    public void returnBookTest(){

        /*
         * to update
         * book class - modify availiablity
         * 
         */
        
         // mock the book class
         Book book = mock(Book.class);

         // create when instance
         boolean isAvailable = true;
         when(book.getAvailablity()).thenReturn(isAvailable);

         // Act
         attend.returnBook(book);

         // assert
         verify(book, times(1)).setAvailability(true);

         // assertFalse(user.) testing if the book is removed from the structure
         
    }






}