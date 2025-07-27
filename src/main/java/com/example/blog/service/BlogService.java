package com.example.blog.service;

import com.example.blog.entity.Blog;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    public String getAllBlogs() {
        return "Hello World";
    }

    public String getBlogById(Long id) {
        return "Hello World";
    }

    public String createBlog(Blog blog) {
        return "Hello World";
    }

    public String updateBlog(Long id, Blog blog) {
        return "Hello World";
    }

    public String deleteBlog(Long id) {
        return "Hello World";
    }
}
