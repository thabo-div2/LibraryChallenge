/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class Book {
    
    String title;
    String author;
    int year;
    
    //constructor
    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    
    //Override toString() method to change format
    @Override
    public String toString() 
    {
        return this.title + " by " + this.author + " (" + this.year + ") "; 
    }
    
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
