package com.example.U5W2D3.blogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    private BlogsService blogsService;

    @GetMapping
    public Page<Blog> getAllBlogs(@RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "10") int size,
                            @RequestParam(defaultValue = "id") String orderBy) {
        return blogsService.getBlogs(page, size, orderBy);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog create(@RequestBody BlogsPayload body) {
        return blogsService.save(body);
    }

    @GetMapping("/{uuid}")
    public Blog getBlogById(@PathVariable UUID uuid) {
        return blogsService.findById(uuid);
    }

    @PutMapping("/{uuid}")
    public Blog updateBlogById(@PathVariable UUID uuid, @RequestBody BlogsPayload blogsPayload) {
        return blogsService.findByIdAndUpdate(uuid, blogsPayload);
    }

    @DeleteMapping("/{uuid}")
    public void deleteById(@PathVariable UUID uuid) {
        blogsService.deleteById(uuid);
    }
}
