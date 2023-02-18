package com.example.elib.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Author extends AbstractEntity {

    private String name;
    private  String Image ;
    private Date DateOfBirth;
    private String PlaceOfBirth;
    private String Nationality;
    private String biography;
    private String Genre ;
    private  String Awards;

    @OneToMany(mappedBy = "Article")
    private List<Article> articleList;
    //1..* Article to 1 Author

}
