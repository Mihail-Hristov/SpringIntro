package com.example.springintro.modules.entities;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book extends BaseEntity{

    private String title;
    private String description;
    private EditionType editionType;
    private BigDecimal price;
    private int copies;
    private LocalDateTime releaseDate;
    private AgeRestriction ageRestriction;
    private Author author;
    private Set<Category> categorises;


    public Book() {
    }

    @Column(name = "title", length = 50, nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "edition_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public EditionType getEditionType() {
        return editionType;
    }

    public void setEditionType(EditionType editionType) {
        this.editionType = editionType;
    }

    @Column(name = "price", precision = 19, scale = 2, nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "copies", nullable = false)
    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Column(name = "release_date")
    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }


    @Column(name = "age_restriction", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @ManyToOne
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @ManyToMany
    public Set<Category> getCategorises() {
        return categorises;
    }

    public void setCategorises(Set<Category> categorises) {
        this.categorises = categorises;
    }
}
