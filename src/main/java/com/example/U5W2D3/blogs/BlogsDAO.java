package com.example.U5W2D3.blogs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BlogsDAO extends JpaRepository<Blog, UUID> {
    Optional<Blog> findByTitle(String title);
}
