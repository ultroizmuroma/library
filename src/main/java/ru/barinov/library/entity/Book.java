package ru.barinov.library.entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE, generator="hiberSeqGen")
    @SequenceGenerator(name = "hiberSeqGen", sequenceName = "HIBERNATE_GENERATOR")
    private Long id;
    private String title;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ID_AUTHOR")
    private Author author;

    public Book() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
