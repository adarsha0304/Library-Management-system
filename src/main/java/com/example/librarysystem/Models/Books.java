package com.example.librarysystem.Models;

import javax.persistence.*;

@Entity
@Table(name="Books")
public class Books {
    @Id
    @Column(name = "book_id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO,generator = "book_generator")
    @SequenceGenerator(name="book_generator",allocationSize = 1,sequenceName = "bookSequence")
    private Long bookId;
    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private String bookType;
    @Column
    private String bookPublished;

    public Books(String bookName, String author, String bookType, String bookPublished) {
        this.bookName = bookName;
        this.author = author;
        this.bookType = bookType;
        this.bookPublished = bookPublished;
    }

    public Books() {

    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookPublished() {
        return bookPublished;
    }

    public void setBookPublished(String bookPublished) {
        this.bookPublished = bookPublished;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookPublished='" + bookPublished + '\'' +
                '}';
    }
}
