package com.example.booknock;

import java.io.Serializable;

public class AllBooks implements Serializable {
    private String BookName;
    private String BookAuthor;
    private int BookImg;
    private String plot;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public int getBookImg() {
        return BookImg;
    }

    public void setBookImg(int bookImg) {
        BookImg = bookImg;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public AllBooks(String bookName, String bookAuthor, int bookImg, String plot) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookImg = bookImg;
        this.plot = plot;


    }
}

