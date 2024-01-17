package com.example.U5W2D3.authors;

import com.example.U5W2D3.blogs.Blog;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatarUrl;
    @OneToMany(mappedBy = "author")
    @ToString.Exclude
    @Getter(AccessLevel.NONE)
    @JsonIgnore
    private List<Blog> blogList;
}
