package com.example.U5W2D3.authors;

import com.example.U5W2D3.blogs.Blog;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatarUrl;
    @OneToMany(mappedBy = "author")
    @ToString.Exclude
    private List<Blog> blogList;
}
