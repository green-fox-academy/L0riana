package com.greenfoxacademy.redditclone;

import com.greenfoxacademy.redditclone.repository.RedditPostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditcloneApplication {

	private RedditPostRepository redditPostRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);
	}
}
