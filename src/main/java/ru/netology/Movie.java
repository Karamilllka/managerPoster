package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Movie {
    private int id;
    private String imageURL;
    private String name;
    private String genre;
}
