/* 5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.    */

import java.util.Scanner;

class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    // Constructor
    public Book(String bookName, String bookAuthor, int bookCount)
     {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    // Getter methods
    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Available Count: " + bookCount);
    }

    // Method to sell books to a customer
    public void sellBook() {
        if (bookCount > 0) {
            System.out.println("Book sold successfully!");
            bookCount--;
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;

    // Constructor
    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    // Method to buy a book
    public void buyBook(Book book) {
        System.out.println("Customer " + customerName + " with ID " + customerId + " is buying the book.");
        book.sellBook();
    }
}

class EbookStall {
    public static void main(String[] args) {
        // Create a book
        Book textbook = new Book("Introduction to Java", "John Doe", 5);

        // Display book details
        System.out.println("Book details before any purchase:");
        textbook.displayBookDetails();

        // Create a customer
        Customer customer1 = new Customer(1, "Alice", "123 Main St");

        // Customer buys a book
        customer1.buyBook(textbook);

        // Display book details after purchase
        System.out.println("\nBook details after customer purchase:");
        textbook.displayBookDetails();
    }
}

