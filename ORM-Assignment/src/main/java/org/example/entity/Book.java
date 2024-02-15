package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    private String id;
    private String title;
    private int publicationYear;
    private double price;
    @ManyToOne
    @JoinColumn(name ="author_id")
    private Author author;

    public Book() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String id, String title, int publicationYear, double price, Author author) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String id, String title, int publicationYear, double price) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }
}
