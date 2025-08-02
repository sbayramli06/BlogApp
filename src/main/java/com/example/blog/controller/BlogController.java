package com.example.blog.controller;

import com.example.blog.entity.Blog;
import com.example.blog.service.BlogService;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/v1/blogs")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BlogController {

    BlogService blogService; // Dependency Injection

    @GetMapping("")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }

    @PostMapping("")
    public Blog addBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
        return blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id) {
         blogService.deleteBlog(id);
    }
}
