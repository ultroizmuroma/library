package ru.barinov.library.entity;

import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="hiberSeqGen")
    @SequenceGenerator(name = "hiberSeqGen", sequenceName = "HIBERNATE_GENERATOR")
    private Long id;
    private String fio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
