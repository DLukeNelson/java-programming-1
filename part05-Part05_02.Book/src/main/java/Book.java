/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    @Override
    public String toString() {
        String description = this.author + ", " + this.name + ", " + this.pages + " page";
        if (this.pages == 1) {
            return description;
        } else {
            return description + "s";
        }
    }
}
