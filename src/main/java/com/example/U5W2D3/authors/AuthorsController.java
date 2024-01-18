package com.example.U5W2D3.authors;

import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Validated
@RequestMapping("/authors")
public class AuthorsController {
    @Autowired
    private AuthorsService authorsService;

    @GetMapping
    public Page<Author> getAuthors(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "10") int size,
                                   @RequestParam(defaultValue = "id") String id) {
        return authorsService.getAuthors(page,size,id);
    }

    @GetMapping("/{uuid}")
    public Author getAuthorById(@PathVariable UUID uuid) {
        return authorsService.findById(uuid);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author create(@RequestBody Author author) {
        return authorsService.save(author);
    }

    @PutMapping("/{uuid}")
    public Author updateById(@PathVariable UUID uuid, @RequestBody Author body) {
        return authorsService.findByIdAndUpdate(uuid, body);
    }

    @DeleteMapping("/{uuid}")
    public void deleteById(@PathVariable UUID uuid) {
        authorsService.deleteById(uuid);
    }


}
