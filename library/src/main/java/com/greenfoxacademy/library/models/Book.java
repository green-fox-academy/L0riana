package com.greenfoxacademy.library.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "book_id")
  private Integer id;
  private String title;
  private String author;
  @Column(name = "isbn")
  private String ISBN;

  public Book() {
  }

  public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }

  public Book(String title) {
    this.title = title;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}
