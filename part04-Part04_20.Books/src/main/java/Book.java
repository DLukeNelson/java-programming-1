/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke <david.luke.nelson@gmail.com>
 */
public class Book {
    private String name;
    private int numberOfPages;
    private int publicationYear;
    
    public Book(String name, int numberOfPages, int publicationYear) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }
}
