package com.nan.tech.api_books.dto;

import jakarta.validation.constraints.Size;
import lombok.*;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank
    @Size(min = 3, max = 20)
    private String name;

    @NotBlank
    @Size(min = 1, max = 20)
    private String author;

    @NotBlank
    @Size(min = 10, max = 500)
    private String description;
}
