package com.greenfoxacademy.todo_mysql.controller;

import com.greenfoxacademy.todo_mysql.model.Todo;
import com.greenfoxacademy.todo_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findByDone(!isActive));
    }
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addTodo() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String addTodo(@RequestParam String title) {
    todoRepository.save(new Todo(title, false, false));
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String edited(@ModelAttribute Todo editedTodo) {
    todoRepository.save(editedTodo);
    return "redirect:/todo/";
  }

  @PostMapping(value = "/todo/search")
  public String search(@ModelAttribute String text, Model model) {
    model.addAttribute("todos", todoRepository.searchTitle(text));
    return "redirect:/todo/";
  }
}
