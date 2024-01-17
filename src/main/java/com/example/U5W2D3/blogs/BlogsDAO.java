package com.example.U5W2D3.blogs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsDAO extends JpaRepository<Blog,Integer> {
}
