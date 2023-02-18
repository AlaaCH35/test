package com.example.elib.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("V")
public class BookItem  extends Article {


    @Column(name = "title", nullable = false)
    private String title;



    @Column(name = "description")
    private String description;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(name = "isbn", unique = true, nullable = false)
    private String ISBN;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private ItemStatus status;




}
