package com.example.U5W2D3.authors;

import com.example.U5W2D3.blogs.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthorsDAO extends JpaRepository<Author,UUID> {
    Optional<Author> findByEmail(String email);


}
