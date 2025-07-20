package com.example.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/v1/blogs")
public class BlogController {
    @GetMapping("")
    public String getAllBlogs() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public String getBlog(@PathVariable int id) {
        return "Hello World";
    }

    @PostMapping("")
    public String addBlog(@RequestBody BlogRequestDTO blogRequestDto){
        return "Hello World";
    }

    @PutMapping("/{id}")
    public String updateBlog(@PathVariable int id, @RequestBody BlogRequestDTO blogRequestDto) {
        return "Hello World";
    }

    @DeleteMapping("/{id}")
    public String deleteBlog(@PathVariable int id) {
        return "Hello World";
    }
}
