package com.example.U5W2D3.blogs;

import com.example.U5W2D3.authors.Author;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Blog {
    private int id;
    private String category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
