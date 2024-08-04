/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.*;
import Classes.Book;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class Library {
    
    // method to add a book to the library
    public static ArrayList<Book> addBookToList(ArrayList<Book> listOfBooks)
    {
        Scanner scan = new Scanner(System.in);
        
        String name;
        String author;
        int year;
        
        System.out.println("Enter name of book: ");
        name = scan.nextLine();
        
        System.out.println("Enter author of the book: ");
        author = scan.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        year = scan.nextInt();
        
        Book newBook = new Book(name, author, year);
        listOfBooks.add(newBook);
        
        System.out.println("Add book to the library!!!");
        
       return listOfBooks; 
    }
    
    // method to remove a book from the library
    public static ArrayList<Book> removeFromBookList(ArrayList<Book> listOfBooks)
    {
        Scanner scan = new Scanner(System.in);
        
        String name;
        
        System.out.println("Enter name of book you want to delete from the system: ");
        name = scan.nextLine();
        
        for(int i = 0; i < listOfBooks.size(); i++)
        {
            if (listOfBooks.get(i).getTitle().equals(name))
            {
                listOfBooks.remove(listOfBooks.get(i));
            }
        }
        
        System.out.println("Removed book from the system!!!");
        
        return listOfBooks; 
    }
    
    // method to display all books in the library
    public static void displayAllBooks(ArrayList<Book> listOfBooks)
    {
        for(int i = 0; i < listOfBooks.size(); i++)
        {
            Book book = listOfBooks.get(i);
            System.out.println(book.toString());
        }
    }
    
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
