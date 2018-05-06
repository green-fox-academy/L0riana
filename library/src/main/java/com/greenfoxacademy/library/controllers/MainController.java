package com.greenfoxacademy.library.controllers;

import com.greenfoxacademy.library.models.Book;
import com.greenfoxacademy.library.models.User;
import com.greenfoxacademy.library.repositories.BookRepository;
import com.greenfoxacademy.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private UserRepository userRepository;
  private BookRepository bookRepository;

  @Autowired
  public MainController(UserRepository userRepository, BookRepository bookRepository) {
    this.userRepository = userRepository;
    this.bookRepository = bookRepository;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute("users", userRepository.findAll());
    model.addAttribute("books", bookRepository.findAll());

    return "index";
  }

  @GetMapping("/books/add")
  public String books(Model model) {
    model.addAttribute("newBook", new Book());
    return "addbook";
  }

  @PostMapping("/books/add")
  public String books(@ModelAttribute Book newBook) {
    bookRepository.save(newBook);
    return "redirect:/";
  }

  @GetMapping("/users/add")
  public String users(Model model) {
    model.addAttribute("newUser", new User());
    return "adduser";
  }

  @PostMapping("/users/add")
  public String users(@ModelAttribute User newUser) {
    userRepository.save(newUser);
    return "redirect:/";
  }
}
