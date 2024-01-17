package com.example.U5W2D3.authors;

import com.example.U5W2D3.blogs.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsDAO extends JpaRepository<Author,Integer> {
    
}
