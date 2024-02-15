package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    private String id;
    private String name;
   private String country;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,orphanRemoval = true)
    private List <Book>bookList;

    public Author() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Author(String id, String name, String country, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.bookList = bookList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
