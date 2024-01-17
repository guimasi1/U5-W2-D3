package com.example.U5W2D3.authors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    @Autowired
    AuthorsService authorsService;

    @GetMapping
    public List<Author> getAuthors(){
        return authorsService.getAuthors();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author save(@RequestBody Author body) {
        return authorsService.save(body);
    }

    @GetMapping("/{id}")
    public Author getById(@PathVariable int id) {
        return authorsService.findById(id);
    }

    @PutMapping("/{id}")
    public Author getByIdAndUpdate(@PathVariable int id, @RequestBody Author body) {
        return authorsService.findByIdAndUpdate(id,body);
    }

    @DeleteMapping("/{id}")
    public void getByIdAndDelete(@PathVariable int id) {
        authorsService.findByIdAndDelete(id);
    }

}
