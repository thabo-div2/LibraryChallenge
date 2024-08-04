/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarychallenge;

import Classes.*;
import java.util.*;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class LibraryChallenge {
    
    static ArrayList<Book> listOfBooks = new ArrayList<>();

    //------------------------------------------------------------------------//
    //This is  main function
    public static void main(String[] args) {
        
        int option = 0;
        int EXIT = 4;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the VC Library Book System");
        while (option != EXIT) 
        {
            System.out.println("1. Add a book to the system \n" +
                           "2. Remove book from the library \n" +
                           "3. Display all the books in the library \n" +
                           "4. Exit program");
            System.out.print("Choose an option: ");
            option = scan.nextInt();
            
            switch(option) 
            {
                case 1: 
                    listOfBooks = Library.addBookToList(listOfBooks);
                    break;
                case 2:
                    listOfBooks = Library.removeFromBookList(listOfBooks);
                    break;
                case 3:
                    Library.displayAllBooks(listOfBooks);
                    break;
                case 4:
                    System.out.println("Exiting... ");
            } 
        }
        
        
        
    }
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
