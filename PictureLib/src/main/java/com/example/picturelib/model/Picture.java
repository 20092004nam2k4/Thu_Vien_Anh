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
    private int id;
    private String image;
    private String nameImage;
    private String description ;
    private String author;
    private String favourite;
    private String tag;


    public Picture() {

    }

    public Picture(String image, String nameImage, String description, String author, String favourite, String tag) {
        this.image = image;
        this.nameImage = nameImage;
        this.description = description;
        this.author = author;
        this.favourite = favourite;
        this.tag = tag;

    }

    public Picture(int id, String image, String nameImage, String description, String author, String favourite, String tag) {
        this.id = id;
        this.image = image;
        this.nameImage = nameImage;
        this.description = description;
        this.author = author;
        this.favourite = favourite;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
