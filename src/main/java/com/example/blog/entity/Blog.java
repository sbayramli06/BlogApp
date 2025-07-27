package com.example.blog.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {
    Integer id;
    String title;
    String content;
    String author;
}
