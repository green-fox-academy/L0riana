package com.greenfoxacademy.redditclone.controller;

import com.greenfoxacademy.redditclone.model.RedditPost;
import com.greenfoxacademy.redditclone.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedditPostController {

  RedditPostRepository redditPostRepository;

  @Autowired
  public RedditPostController(RedditPostRepository redditPostRepository) {
    this.redditPostRepository = redditPostRepository;
  }

  @RequestMapping(value = "/")
  public String indexPage() {
    return "index";
  }

  @GetMapping(value = "/submit")
  public String submitRedditPost() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitRedditPost(@RequestParam String postTitle) {
    redditPostRepository.save(new RedditPost(postTitle));
    return "redirect:/index";
  }
}
