package com.example.U5W2D3.authors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class AuthorsPayload {
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatarUrl;
}
