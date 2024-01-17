package com.example.U5W2D3.blogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    private BlogsService blogsService;
    @GetMapping
    public List<Blog> getBlogs(){
        return blogsService.getBlogs();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog postBlog(@RequestBody Blog body){
        return blogsService.save(body);
    }

    @GetMapping("/{id}")
    public Blog getById(int id) {
        return blogsService.findById(id);
    }

    @PutMapping("/{id}")
    public Blog updateById(@PathVariable int id, @RequestBody Blog body) {
        return blogsService.findByIdAndUpdate(id,body);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        blogsService.findByIdAndDelete(id);
    }


}
