package com.example.picturelib.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Picture;
    private String name_Picture;
    private String description;
    private String author;
    private Date date_Submitted;
    private boolean favourite;
    private String tags;

    public Picture() {
    }

    public Picture(String name_Picture, String describe, String author, Date date_Submitted, boolean favourite, String tags) {
        this.name_Picture = name_Picture;
        this.description = describe;
        this.author = author;
        this.date_Submitted = date_Submitted;
        this.favourite = favourite;
        this.tags = tags;
    }

    public Picture(Long id_Picture, String name_Picture, String describe, String author, Date date_Submitted, boolean favourite, String tags) {
        this.id_Picture = id_Picture;
        this.name_Picture = name_Picture;
        this.description = describe;
        this.author = author;
        this.date_Submitted = date_Submitted;
        this.favourite = favourite;
        this.tags = tags;
    }

    public Long getId_Picture() {
        return id_Picture;
    }

    public void setId_Picture(Long id_Picture) {
        this.id_Picture = id_Picture;
    }

    public String getName_Picture() {
        return name_Picture;
    }

    public void setName_Picture(String name_Picture) {
        this.name_Picture = name_Picture;
    }

    public String getDescribe() {
        return description;
    }

    public void setDescribe(String describe) {
        this.description = describe;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate_Submitted() {
        return date_Submitted;
    }

    public void setDate_Submitted(Date date_Submitted) {
        this.date_Submitted = date_Submitted;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
